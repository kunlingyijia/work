package com.dw.bianmin.utils;

/**
 * Created by z_fugui on 16/5/30.
 */
public class RequestACT {
我是
    //开发
    public static String url = "http://test.dongwuit.com/?";
    public static String urlImage = "http://test.dongwuit.com/?";//


    //测试
//    public static String url = "http://test.bmin.wang/?";
//    public static String urlImage = "http://test.bmin.wang/?";//

    //    正式
//    public static String url = "http://api.bmin.wang/?";
//    public static String urlImage = "http://img.bmin.wang/?";//
    public final static String aliPayNotifyUrl = "http://api.bmin.wang/Api/Alipay/payNotifyUrl";
    public static String requestCode = url + "act=Api/User/requestVerifyCode";//请求验证码
    public static String requestRegister = url + "act=Api/User/requestRegister";//注册
    public static String requestLogin = url + "act=Api/User/requestLogin";//登录
    public static String ResetPwd = url + "act=Api/User/requestResetPwdByVerifyCode";//修改密码
    public static String requestUserInfo = url + "act=Api/User/requestUserInfo";//获取个人信息
    public static String requestModifyUserInfo = url + "act=Api/User/requestModifyUserInfo";//修改个人信息
    public static String requestServiceReigon1 = url + "act=Api/Region/requestServiceReigonList";//
    public static String requestAddAddress = url + "act=Api/User/requestAddAddress";//添加地址
    public static String requestListAddress = url + "act=Api/User/requestListAddress";//获取收货地址
    public static String requestFeedback = url + "act=Api/User/requestFeedback";//意见反馈
    public static String requestSignin = url + "act=Api/User/requestSignin";//签到接口
    public static String requestSigninList = url + "act=Api/User/requestSigninList";//签到获取列表
    public static String requestUpdateAddress = url + "act=Api/User/requestUpdateAddress";//修改收货地址
    public static String requestDeleteAddress = url + "act=Api/User/requestDeleteAddress";//删除收获地址
    public static String requestHomePageAdLis = url + "act=Api/Home/requestHomePageAdList";//首页轮播图广告位
    public static String requestVersionUpdate = url + "act=Api/Version/requestLastVersion";//请求最新的版本号
    public static String requestThirdPartLogin = url + "act=Api/User/requestThirdPartLogin";//第三方登录接口
    public static String requestBindPhoneNum = url + "act=Api/User/requestBindPhoneNum";//第三方登录，绑定手机号码
    public static String requestScoreGoodsList = url + "act=Api/Home/requestScoreGoodsList";//积分商品展示
    public static String requestScoreConf = url + "act=Api/Home/requestScoreConf";//积分商品展示
    public static String requestAddScoreOrder = url + "act=Api/User/requestAddScoreOrder";//积分兑换
    public static String requestTotalScore = url + "act=Api/User/requestTotalScore";//获取当前积分
    public static String requestMerchantList = url + "act=Api/Home/requestMerchantList";//根据分类ID获取该分类下的商家列表搜索商家
    public static String requestAddTripList = url + "act=Api/User/requestAddTripList";// 添加出行
    public static String requestUnbindSocialAccount = url + "act=Api/User/requestUnbindSocialAccount";//  取消绑定第三方帐号
    public static String requestMerchantDetail = url + "act=Api/Home/requestMerchantDetail";//  获取具体某个商家详情
    public static String requestCollectMerchant = url + "act=Api/User/requestCollectMerchant";//   收藏/取消收藏某个商家
    public static String requestMerchantGoodsList = url + "act=Api/Home/requestMerchantGoodsList";//  获取商家的商品列表
    public static String requestMyTripList = url + "act=Api/User/requestMyTripList";//获取我的出行记录
    public static String requestUserSigninList = url + "act=Api/User/requestUserSigninList";//我的签到记录
    public static String requestReceiveCoupon = url + "act=Api/User/requestReceiveCoupon";//领取优惠券
    public static String requestMerchantCouponList = url + "act=Api/Home/requestMerchantCouponList";//获取商家优惠券列表
    public static String requestRecommendMerchantList = url + "act=Api/Home/requestRecommendMerchantList";// 获取首页推荐商家列表
    public static String requestActiveInfo = url + "act=Api/Home/requestActiveInfo";// 获取首页活动详情
    public static String requestActiveList = url + "act=Api/Home/requestActiveList";// 获取首页商家活动
    public static String requestCollectMerchantList = url + "act=Api/User/requestCollectMerchantList";// 我的收藏
    public static String requestMyCouponList = url + "act=Api/User/requestMyCouponList";// 抵用券
    public static String requestPayOrder = url + "act=Api/Order/requestPayGoodsOrder";// 生成支付订单
    public static String requestMerchantCommentList = url + "act=Api/Home/requestMerchantCommentList";//  获取商家所有商品(或单个商品)评论列表
    public static String requestAddGoodsOrder = url + "act=Api/Order/requestAddGoodsOrder";//  提交订单
    public static String requestMyGoodsOrderList = url + "act=Api/Order/requestMyGoodsOrderList";// 我的订单
    public static String requestGoodsInfo = url + "act=Api/Home/requestGoodsInfo";//获取商品详情
    public static String requestMyGoodsOrderDetail = url + "act=Api/Order/requestMyGoodsOrderDetail";//订单详情
    public static String requestRefundGoodsOrder = url + "act=Api/Order/requestRefundGoodsOrder";//申请退款
    public static String requestCancelGoodsOrder = url + "act=Api/Order/requestCancelGoodsOrder";//取消订单
    public static String requestMyGoodsOrderNumber = url + "act=Api/Order/requestMyGoodsOrderNumber";// 我的订单数量
    public static String requestAddGoodsComment = url + "act=Api/User/requestAddGoodsComment";// 评价
    public static String requestRefundGoodsOrderDetail = url + "act=Api/Order/requestRefundGoodsOrderDetail";//退款详情
    public static String requestScoreHistoryList = url + "act=Api/User/requestScoreHistoryList";// 获取积分历史记录
    public static String requestScoreOrderList = url + "act=Api/User/requestScoreOrderList";//  积分兑换记录
    public static String requestGovAffairsList = url + "act=Api/Home/requestGovAffairsList";//  3.22 获取政务信息
    public static String requestCallPlatform = url + "act=Api/Sys/requestCallPlatform";//  呼叫平台
    public static String requestMessageList = url + "act=Api/User/requestMessageList";// 获取用户消息列表
    public static String requestAgreementLinks = url + "act=Api/Sys/requestAgreementLinks";// 获取协议links
    public static String requestMerchantApply = url + "act=MerApi/Merchant/requestMerchantApply";// 新商户入驻申请
    public static String requestMenuList = url + "act=Api/Merchant/requestMenuList";//获取首页菜单
    public static String requestCateAndBusinessarea = url + "act=Api/Merchant/requestCateAndBusinessarea";//获取首页菜单
    public static String requestActiveServiceReigonList = url + "act=Api/Region/requestActiveServiceReigonList";//获取首页菜单
    public static String requestAddBminorder = url + "act=Api/Order/requestAddBminorder";//提交便民订单
    public static String requestBminserviceList = url + "act=Api/Bmin/requestBminserviceList";//获取便民服务项目列表
    public static String requestMyBminorderList = url + "act=Api/Order/requestMyBminorderList";//获取便民订单
    public static String requestMyBminorderDetail = url + "act=Api/Order/requestMyBminorderDetail";//便民订单详情
    public static String requestBminUrge = url + "act=Api/Order/requestBminUrge";// 便民订单催单
    public static String requestPayBminOrder = url + "act=Api/Order/requestPayBminOrder";// 便民订单支付
    public static String requestBminCancelOrder = url + "act=Api/Order/requestBminCancelOrder";// 便民订单取消订单
    public static String requestTripList = url + "act=Api/Trip/requestTripList";//  获取车次列表
    public static String requestTravelPlanList = url + "act=Api/TravelPlan/requestTravelPlanList";//  获取车次列表,新 修改
    public static String requestSearchStation = url + "act=Api/Trip/requestSearchStation";//  获取车次列表
    public static String requestTripDetail = url + "act=Api/Trip/requestTripDetail";// 出行详情
    public static String requestAddTriporder = url + "act=Api/Trip/requestAddTriporder";//  预约出行
    public static String requestTripOrderList = url + "act=Api/Trip/requestTripOrderList";//  获取订单列表
    public static String requestTripMyOrderList = url + "act=Api/TravelOrder/requestMyOrderList";//   我的出行订单列表
    public static String requestRefundInfo = url + "act=Api/TravelOrderRefund/requestRefundInfo";//   退款详情
    public static String requestTriporderDetail = url + "act=Api/Trip/requestTriporderDetail";// 获取订单详情
    public static String requestMyOrderInfo = url + "act=Api/TravelOrder/requestMyOrderInfo";// 获取订单详情
    public static String requestPayTripOrder = url + "act=Api/Trip/requestPayTripOrder";// 支付
    public static String requestTripPayOrder = url + "act=Api/TravelOrder/requestPayOrder";// 出行支付
    public static String requestOrderCancel = url + "act=Api/TravelOrder/requestOrderCancel";//  取消订单
    public static String requestConfig = url + "act=Api/Sys/requestConfig";// 获取易民钱包信息
    public static String requestThirdPartBind = url + "act=Api/User/requestThirdPartBind";//登录后的第三方绑定
    public static String requestUnsubscribeTriporder = url + "act=Api/Trip/requestUnsubscribeTriporder";// 退订
    public static String requestTravelPlanInfo = url + "act=Api/TravelPlan/RequestTravelPlanInfo";// 车次详情
    public static String requestAddOrder = url + "act=Api/TravelOrder/requestAddOrder";//  预约/提交订单
    public static String requestOrderToMobile = url + "act=Api/TravelOrder/requestOrderToMobile";//  发送行程到手机
    public static String requestApplyRefund = url + "act=Api/TravelOrderRefund/requestApplyRefund";//   申请退款
    public static String requestOrderComplete = url + "act=Api/TravelOrder/requestOrderComplete";//   我已到达目的地
    public static String requestRefundconfig = url + "act=Api/TravelOrderRefund/requestRefundconfig";//  申请退款-获取退款配置
    public static String requestPosition = url + "act=Api/TravelDriver/requestPosition";//  20.13 获取行程车主位置(司机点发车了才可以)
    public static String requestDeleteMyCoupon = url + "act=Api/User/requestDeleteMyCoupon";//  3.10 删除领取的抵用券


    public static String upDataImageHead = urlImage + "act=Api/Image/upload";
}
