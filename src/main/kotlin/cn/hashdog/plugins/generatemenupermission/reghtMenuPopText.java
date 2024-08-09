package cn.hashdog.plugins.generatemenupermission;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.ui.Messages;

public class reghtMenuPopText extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        String text = e.getData(PlatformDataKeys.EDITOR).getSelectionModel().getSelectedText();
        Messages.showInfoMessage("选中文本为：" + text, "选中文本");
    }
}
