package com.form.user.controller;

import org.patchca.background.SingleColorBackgroundFactory;
import org.patchca.color.SingleColorFactory;
import org.patchca.filter.predefined.CurvesRippleFilterFactory;
import org.patchca.font.RandomFontFactory;
import org.patchca.service.AbstractCaptchaService;
import org.patchca.text.renderer.BestFitTextRenderer;
import org.patchca.utils.encoder.EncoderHelper;
import org.patchca.word.RandomWordFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 验证码控制器
 *
 * @author zhuhui
 * @date 2018-04-11
 */
@Controller
public class CapthcaController {

    private static final int FIVE = 4;

    private static final int SIX = 4;
    private static final int THIRTYONE = 31;
    private static final int TWENTYFIVE = 25;
    private static final int THIRTY = 30;
    private static final int SIXTY = 60;
    private static final int NINETY = 90;
    private static final int OSZ = 170;

    private static final String PATCHCA = "PATCHCA";

    private static final String MOBILE_PATCHA = "MPATCHCA";

    /**
     * 获取验证码
     *
     * @param req
     *            HttpServletRequest
     * @param resp
     *            HttpServletResponse
     * @throws ServletException
     *             ServletException
     * @throws IOException
     *             IOException
     */
    @RequestMapping("/patchca")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MyCaptchaService cs = new MyCaptchaService();
        resp.setContentType("image/png");
        resp.setHeader("cache", "no-cache");
        HttpSession session = req.getSession(true);
        OutputStream os = resp.getOutputStream();
        String patcha = EncoderHelper.getChallangeAndWriteImage(cs, "png", os);

        session.setAttribute(PATCHCA, patcha);
        session.setAttribute(MOBILE_PATCHA,patcha);
        os.flush();
        os.close();
        cs = null;

    }

    /**
     * 图形验证码与手机
     */
    @RequestMapping("/bindCheckCode")
    @ResponseBody
    public Boolean bindCheckCode(HttpServletRequest request){
        String mobile = request.getParameter("mobile");
        request.getSession().setAttribute("phoneBindCheckCode",mobile+request.getSession().getAttribute(PATCHCA));
        return Boolean.TRUE;
    }

    /**
     * 获取验证码
     *
     * @param req
     *            HttpServletRequest
     * @param resp
     *            HttpServletResponse
     * @return session中的验证码
     * @throws ServletException
     *             ServletException
     * @throws IOException
     *             IOException
     */
    @RequestMapping("/patchcaSession")
    @ResponseBody
    protected String dopost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取sessoin中的验证码
        return (String) req.getSession().getAttribute(PATCHCA);

    }

    /**
     * 验证验证码 验证页面传过来的验证码是否与session保存的验证码相等
     *
     * @param req
     *            HttpServletRequest
     * @return 相符返回1，否则返回0
     */
    @RequestMapping("/checkpatchca")
    @ResponseBody
    protected int checkpatchca(HttpServletRequest req, String enterValue) {
        // 获取sessoin中的验证码
        String patchca = (String) req.getSession().getAttribute(PATCHCA);
        if (null != enterValue) {

//            LOGGER.info("code in session is :" + patchca);
            // 验证页面传过来的验证码是否与session保存的验证码相等
            return enterValue.equals(patchca) ? 1 : 0;
        }
        return 0;
    }

    /**
     * 验证码接口服务类
     *
     * @author NP-HEHU
     * @date 2015-8-28 17:01:58
     */
    private static class MyCaptchaService extends AbstractCaptchaService {

        /**
         * 验证码接口服务构造方法
         */
        public MyCaptchaService() {
            String[] fontOption = { "Verdana", "Tahoma" };
            wordFactory = new MyWordFactory();
            fontFactory = new RandomFontFactory(THIRTYONE, fontOption);
            textRenderer = new BestFitTextRenderer();
            backgroundFactory = new SingleColorBackgroundFactory();
            colorFactory = new SingleColorFactory(new Color(TWENTYFIVE, SIXTY, OSZ));
            filterFactory = new CurvesRippleFilterFactory(colorFactory);
            width = NINETY;
            height = THIRTY;

        }
    }

    /**
     * 验证码生成器
     *
     * @author NP-HEHU
     * @date 2015-8-28 17:02:35
     */
    private static class MyWordFactory extends RandomWordFactory {

        /**
         * 验证码生成器构造方法
         */
        public MyWordFactory() {
            // characters = "absdekmnowx23456789";
            characters = "123456789";
            minLength = FIVE;
            maxLength = SIX;
        }
    }
}
