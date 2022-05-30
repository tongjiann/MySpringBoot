package com.xiw.bfpp;

import com.xiw.bean.Name;

import java.beans.PropertyEditorSupport;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-30 11:53
 */
public class MyPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] s = text.split("_");
        Name name = new Name(s[0], s[1]);
        super.setValue(name);
    }
}
