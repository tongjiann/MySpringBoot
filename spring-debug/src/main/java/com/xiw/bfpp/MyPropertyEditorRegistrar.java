package com.xiw.bfpp;

import com.xiw.bean.Name;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.util.Date;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-30 11:55
 */
public class MyPropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Name.class, new MyPropertyEditor());
    }
}
