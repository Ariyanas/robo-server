package utils;

import classes.Project;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Ariyanas
 */
public class CList extends JLabel implements ListCellRenderer<Project> {

    public CList() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Project> list, Project project, int index,
            boolean isSelected, boolean cellHasFocus) {

        String icon = project.getType();

        icon = icon.replaceAll(" ", "_");
        icon = icon.toLowerCase();

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/" + icon + ".png"));
        Image img = imageIcon.getImage();
        imageIcon.setImage(getScaledImage(img, 16, 16));

        setIcon(imageIcon);
        setText(project.toString());
        setBorder(new EmptyBorder(2,5,2,2));

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        return this;
    }

    Image getScaledImage(Image Img, int wt, int ht) {
        BufferedImage resizedImg = new BufferedImage(wt, ht, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(Img, 0, 0, wt, ht, null);
        g2.dispose();

        return resizedImg;
    }

}
