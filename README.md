# VerticalSwitchTextView
本文使用继承TextView实现垂直切换Text的效果。效果类似于很多app首页上滚动的广告位。

实现中使用了属性动画ValueAnimator来进行Text绘制过程的控制。

可以通过自定义属性来定制切换时间，间隔时间和切换方向。

并且定义了回调接口用于调用者处理点击事件和获得切换的通知。

to do：增加文字的对齐方式。

具体的效果如下：

![](https://github.com/viclee2014/VerticalSwitchTextView/blob/master/app/src/main/res/raw/vertical_switch_textview.gif)
