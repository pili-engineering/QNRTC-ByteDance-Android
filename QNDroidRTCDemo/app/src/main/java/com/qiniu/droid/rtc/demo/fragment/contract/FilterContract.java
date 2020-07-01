package com.qiniu.droid.rtc.demo.fragment.contract;

import com.qiniu.bytedanceplugin.model.FilterModel;
import com.qiniu.droid.rtc.demo.base.BasePresenter;
import com.qiniu.droid.rtc.demo.base.IView;

import java.util.List;


public interface FilterContract {
    interface View extends IView {

    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract List<FilterModel> getItems();
    }
}
