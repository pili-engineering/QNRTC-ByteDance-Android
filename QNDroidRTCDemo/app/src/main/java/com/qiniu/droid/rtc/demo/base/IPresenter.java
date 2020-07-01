package com.qiniu.droid.rtc.demo.base;

public interface IPresenter {
    void attachView(IView view);
    void detachView();
}
