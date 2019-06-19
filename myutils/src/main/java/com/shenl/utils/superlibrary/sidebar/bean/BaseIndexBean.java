
package com.shenl.utils.superlibrary.sidebar.bean;

import com.shenl.utils.superlibrary.callback.ISuspensionInterface;


public abstract class BaseIndexBean implements ISuspensionInterface {
    private String baseIndexTag;// 所属的分类（城市的汉语拼音首字母）

    public String getBaseIndexTag() {
        return baseIndexTag;
    }

    public BaseIndexBean setBaseIndexTag(String baseIndexTag) {
        this.baseIndexTag = baseIndexTag;
        return this;
    }

    @Override
    public String getSuspensionTag() {
        return baseIndexTag;
    }

    @Override
    public boolean isShowSuspension() {
        return true;
    }
}
