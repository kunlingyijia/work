package com.gd.dfb.utils;

/**
 * Created by z_fugui on 16/5/30.
 */
public class RequestACT {
后的
    //    正式


    public static String url = "我在测试3333";
    订单
    public static String urlImage = "http://img.zgduifubao.com/?";//
    public static String urlWebviewBaseUrl = "https://api.zgduifubao.com/";//
//        测试
//    public static String url = "http://dfb.dongwuit.com/?";//
//    public static String urlWebviewBaseUrl = "http://dfb.dongwuit.com/";//
//    public static String urlImage = "http://dfb.dongwuit.com/?";



    public static String requestCode = url + "act=Api/VerifyCode/requestVerifyCode";//请求验证码
    public static String requestRegister = url + "act=Api/User/requestRegister";//注册
    public static String requestLogin = url + "act=Api/User/requestLogin";//登录
    public static String ResetPwd = url + "act=Api/User/requestForgottenPassword";//修改密码
    public static String requestSetPayPassword = url + "act=Api/User/requestSetPayPassword";//设置支付密码
    public static String requestUserInfo = url + "act=Api/User/requestUserInfo";//获取个人信息
    public static String requestCollectGoods = url + "act=Api/User/requestCollectGoods";//关注/取消商品
    public static String requestGoodsContent = url + "act=Api/Mall/requestGoodsContent";//商品图文介绍
    public static String requestGoodsInfo = url + "act=Api/Mall/requestGoodsInfo";//商品详情
    public static String requestSigninList = url + "act=Api/User/requestSigninList";//签到获取列表
    public static String requestVersionUpdate = url + "act=Api/Version/requestVersionUpdate";//请求最新的版本号
    public static String requestThirdPartLogin = url + "act=Api/User/requestThirdPartLogin";//第三方登录接口
    public static String requestUnbindSocialAccount = url + "act=Api/User/requestUnbindSocialAccount";//  取消绑定第三方帐号
    public static String requestRechargeDfbao = url + "act=Api/User/requestRechargeDfbao";// 生成支付订单
    public static String requestRechargeVirtualGlod = url + "act=Api/User/requestRechargeVirtualGlod";//18.2 兑富币充值
    public static String requestAgreementLinks = url + "act=Api/Sys/requestAgreementLinks";// 获取协议links
    public static String requestActiveServiceReigonList = url + "act=Api/Region/requestActiveServiceReigonList";//获取首页菜单
    public static String requestFeedback = url + "act=Api/Feedback/requestFeedback";//意见反馈
    public static String requestAddressList = url + "act=Api/Address/requestAddressList";//获取收货地址列表
    public static String requestAddAddress = url + "act=Api/Address/requestAddAddress";//添加收货地址
    public static String requestDelAddress = url + "act=Api/Address/requestDelAddress";// 删除收货地址
    public static String requestUpdateAddress = url + "act=Api/Address/requestUpdateAddress";// 修改收货地址
    public static String requesSetDefaultAddress = url + "act=Api/Address/requesSetDefaultAddress";// 设置默认收货地址
    public static String requestPayEntrepreneurship = url + "act=Api/Entrepreneurship/requestPayEntrepreneurship";// 创业会员在线购买(兑富金币)
    public static String requestUpgrade = url + "act=Api/Entrepreneurship/requestUpgrade";// 18.1 升级创业会员（现金+兑富币）
    public static String requestCertification = url + "act=Api/Entrepreneurship/requestCertification";// 创业会员实名认证
    public static String requestUpdateUserInfo = url + "act=Api/User/requestUpdateUserInfo";//修改个人信息
    public static String requestBillList = url + "act=Api/Bill/requestBillList";//获取增票资质列表
    public static String requestCertificationInfo = url + "act=Api/Entrepreneurship/requestCertificationInfo";//实名认证资料
    public static String requestGetShopInfo = url + "act=Api/Entrepreneurship/requestShopInfo";//获取开店资料
    public static String requestScoreList = url + "act=Api/Score/requestScoreList";//实名认证资料
    public static String requestScoreExchange = url + "act=Api/Score/requestScoreExchange";//  积分兑换兑富币/兑富币+兑富宝
    public static String requestVirtualGlodList = url + "act=Api/Score/requestVirtualGlodList";//  兑富宝列表
    public static String requestCashList = url + "act=Api/Score/requestCashList";//现金列表
    public static String requestBankInfo = url + "act=Api/Finance/requestBankInfo";//  获取银行卡信息
    public static String requestApplyDraw = url + "act=Api/Finance/requestApplyDraw";//   提现申请
    public static String requestUpdateBank = url + "act=Api/Finance/requestUpdateBank";//   修改银行卡
    public static String getUserMerberInfo = url + "act=Api/User/getUserMerberInfo";//获取用户注册会员详情
    public static String requestChangePhone = url + "act=Api/User/requestChangePhone";//  更换手机号码
    public static String requestConfig = url + "act=Api/System/config"; // 配置信息
    public static String requestotherConfig = url + "act=Api/System/otherConfig"; // 其他配置
    public static String requestCompleteShopInfo = url + "act=Api/Entrepreneurship/requestCompleteShopInfo";//  完善开店资料
    public static String requestAd = url + "act=Api/Ad/requestAd";//   开屏广告
    public static String requestMerchantList = url + "act=Api/Merchant/requestMerchantList";//   获取首页店铺列表
    public static String requestApplyAreaAgency = url + "act=Api/Agency/requestApplyAreaAgency";//申请区域代理
    public static String requestAreaAgencyList = url + "act=Api/Agency/requestAreaAgencyList";//区域代理列表
    public static String requestIndustryList = url + "act=Api/Industry/requestIndustryList";//获取行业分类
    public static String requestC2cCategoryList = url + "act=Api/C2CCategory/requestC2cCategoryList";//获取分类
    public static String requestMerchantInfo = url + "act=Api/Merchant/requestMerchantInfo";// 获取我的店铺
    public static String requestCommentList = url + "act=Api/Mall/requestCommentList";// 商品评价列表
    public static String requestAddCart = url + "act=Api/Cart/requestAddCart";// 14.18 添加购物车
    public static String requestPayGoodsOrder = url + "act=Api/Mall/requestPayGoodsOrder";//14.24 订单支付
    public static String requestConfirmReceive = url + "act=Api/Mall/requestConfirmReceive";// 14.31 确认收货
    public static String requestGoodsOrder = url + "act=Api/Mall/requestGoodsOrder";// 14.22 新建订单
    public static String requestOrderFreight = url + "act=Api/Mall/requestOrderFreight";// 14.32 请求订单运费
    public static String requestOrderInfo = url + "act=Api/Mall/requestOrderInfo";//14.26 订单详情
    public static String requestComment = url + "act=Api/Mall/requestComment";//14.28 添加评价
    public static String requestLogistics = url + "act=Api/Mall/requestLogistics";// 14.27 查看物流
    public static String requestMyOrderList = url + "act=Api/Mall/requestMyOrderList";// 14.25 我的订单列表
    public static String requestMyMerchantInfo = url + "act=Api/Merchant/requestMyMerchantInfo";// 获取店铺信息
    public static String requestMessageList = url + "act=Api/Message/requestMessageList";//  消息列表
    public static String requestCollectMerchant = url + "act=Api/User/requestCollectMerchant";// 关注/取消关注店铺
    public static String requestMerchantCollectList = url + "act=Api/User/requestMerchantCollectList";//关注的店铺
    public static String requestGoodsCollectList = url + "act=Api/User/requestGoodsCollectList";//14.17 关注的商品列表
    public static String requestMoney = url + "act=Api/O2O/requestMoney";//获取金额
    public static String requestPayOrderList = url + "act=Api/O2O/requestPayOrderList";// 获取收款列表
    public static String requestPayConfigList = url + "act=Api/O2O/requestPayConfigList";// 获取收款 方式列表
    public static String requestDrawConfigList = url + "act=Api/O2O/requestDrawConfigList";// 获取提现方式列表
    public static String requestPayOrder = url + "act=Api/O2O/requestPayOrder";// O2O收款
    public static String requestCkZidaoGathering = url + "act=Api/O2O/requestCkZidaoGathering";// 资道登录验证
    public static String requestZidaoDraw = url + "act=Api/O2O/requestZidaoDraw";// 已做登录验证，返回结果参照19.6
    public static String requestZidaoCertification = url + "act=Api/O2O/requestZidaoCertification";// 资道实名认证
    public static String requestZidaoCertificationInfo = url + "act=Api/O2O/requestZidaoCertificationInfo";//  获取资道实名认证资料
    public static String requestHandlePassword = url + "act=Api/User/requestHandlePassword";//   设置手势密码/验证
    public static String requestCheckVerifyCode = url + "act=Api/VerifyCode/requestCheckVerifyCode";//   设置手势密码/验证
    public static String requestGoodsList = url + "act=Api/Mall/requestGoodsList";//  商品列表
    public static String requestHomepage = url + "act=Api/Homepage/requestHomepage";//   获取首页
    public static String requestCartList = url + "act=Api/Cart/requestCartList";//   获取购物车商品
    public static String requestChangeCart = url + "act=Api/Cart/requestChangeCart";//   修改购物车商品
    public static String requestUpdateCartList = url + "act=Api/Cart/requestUpdateCartList";//   删除购物车商品
    public static String requestMyService = url + "act=Api/Article/requestTypeList";//   我的服务
    public static String requestMyArticle = url + "act=Api/Article/requestArticleListByType";//   我的服务->文章列表
    public static String requestDetail = url + "act=Api/Article/requestDetail";//   文章详情
    public static String requestDetailByType = url + "act=Api/Article/requestDetailByType";//   文章详情-按类型（注册协议/权益说明）
    public static String requestListByType = url + "act=Api/Article/requestListByType";//   问题与帮助/我要开店文章标题列表
    public static String requestconfig = url + "act=Api/System/config";//   配置信息
    public static String requestApplyInfoList = url + "act=Api/Service/requestApplyInfoList";//   我要办卡/我要贷款列表
    public static String requestCashExchange = url + "act=Api/Cash/requestCashExchange";//   现金兑换兑富币
    public static String requestCancelOrder = url + "act=Api/Mall/requestCancelOrder";//  14.23 取消订单


    public static String upDataImageHead = urlImage + "act=Api/Image/upload";


    public final static String HTML_START = "<!DOCTYPE html><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><title>title</title><meta name=\"viewport\" content=\"width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;\" /><meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />"
            + "<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\" /><meta name=\"format-detection\" content=\"telephone=no\" />"
            + "<link href=\"style/css/style.css\" type=\"text/css\" rel=\"stylesheet\" /><script src=\"style/js/jquery-1.7.2.min.js\" type=\"text/javascript\"></script><script src=\"style/js/iscroll.js\" type=\"text/javascript\"></script><script src=\"style/js/inner.js\" type=\"text/javascript\"></script><script src=\"style/js/common.js\" type=\"text/javascript\"></script>"
            + "<style>img{width:100%}</style>"
            + "<style>video{width:100%}</style>"
//            + "<style> html,body,.cover{margin:0;height:100%;width: 100%;} img{height:100%;width:100%;position:relative;display:block;margin:0 auto;} .cover{background-color:rgba(0, 0, 0, 1);position:fixed;top: 0;left:0;display:none;} .bg-animation{animation: bg 0.4s;-webkit-animation: bg 0.4s;display:block !important;} @keyframes bg { from {background: rgba(0, 0, 0, 0);} to {background: rgba(0, 0, 0, 1);}} @-webkit-keyframes bg /* Safari 和 Chrome */ { from {background: rgba(0, 0, 0, 0);} to {background: rgba(0, 0, 0, 1);} }</style>"
            + "</head>"
            + "<body>";


    public final static String HTML_END = "</body></html>";
}
