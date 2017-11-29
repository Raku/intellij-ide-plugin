package edument.perl6idea.utils;

import javax.swing.*;
import java.awt.*;

public class GUIHelpers {
    public static void addLabelAndTextFIeld(JPanel myPanel, String labelText, int yPos, JComponent field) {
        JLabel label = new JLabel(labelText);
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.fill = GridBagConstraints.BOTH;
        labelConstraints.gridx = 0;
        labelConstraints.gridy = yPos;
        myPanel.add(label, labelConstraints);

        GridBagConstraints fieldConstraints = new GridBagConstraints();
        fieldConstraints.gridx = 1;
        fieldConstraints.gridy = yPos;
        myPanel.add(field, fieldConstraints);
    }
}
