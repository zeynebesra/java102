package com.patikadev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {

    public static int screenCenterPoint(String axis , Dimension size){
        int point;
        switch (axis){
            case "x":
                point =(Toolkit.getDefaultToolkit().getScreenSize().width-size.width)/2;
                break;
            case "y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height-size.height)/2;
                break;
            default:
                point = 0;
        }
        return point;
    }

    // boş mu değil mi text
    public static boolean isFieldEmpty(JTextField field){
        return  field.getText().trim().isEmpty();
    }

    //mesaj görüntüleme
    public static void showMessage(String str){
        optionPaneTR();
        String msg;
        String title;
        switch (str){
            case "fill":
                msg="Lütfen Tüm Alanları Doldurun!";
                title = "Hata !";
                break;
            case "success":
                msg="İşlem Tamamlandı";
                title = "Sonuç";
                break;
            case "error":
                msg="Bir Hata Oluştu !";
                title = "Hata !";
                break;
            default:
                msg=str;
                title = "Mesaj";
        }
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void optionPaneTR(){
        UIManager.put("OptionPane.okButtonText","Tamam");
        UIManager.put("OptionPane.yesButtonText","Evet");
        UIManager.put("OptionPane.noButtonText","Hayır");
    }




    public static void setLayout(){
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if ("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public static boolean confirm(String str){
        optionPaneTR();
        String msg;
        switch (str){
            case "sure":
                msg = "Bu işlemi gerçekleştirmek istediğinize emin misiniz?";
                break;
            default:
                msg = str;
        }
        return JOptionPane.showConfirmDialog(null,msg,"Son kararınız mı?",JOptionPane.YES_OPTION) == 0;
    }
}
