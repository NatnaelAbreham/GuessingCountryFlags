package guessingflag;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GuessingFlag extends JFrame {

    //width and height of the image
    final int IMAGEWIDTH = 350, IMAGEHEIGHT = 350;

    ImageIcon afgan = new ImageIcon(getClass().getResource("afgan.png"));
    ImageIcon andora = new ImageIcon(getClass().getResource("andora.png"));
    ImageIcon angola = new ImageIcon(getClass().getResource("angola.png"));
    ImageIcon argentina = new ImageIcon(getClass().getResource("argentina.png"));
    ImageIcon barbados = new ImageIcon(getClass().getResource("barbados.png"));
    ImageIcon benin = new ImageIcon(getClass().getResource("bebin.png"));
    ImageIcon belgume = new ImageIcon(getClass().getResource("belgume.png"));
    ImageIcon brazil = new ImageIcon(getClass().getResource("brazil.png"));
    ImageIcon burundi = new ImageIcon(getClass().getResource("burundi.png"));
    ImageIcon butan = new ImageIcon(getClass().getResource("butan.png"));

    ImageIcon canada = new ImageIcon(getClass().getResource("canada.png"));
    ImageIcon china = new ImageIcon(getClass().getResource("china.png"));
    ImageIcon combodia = new ImageIcon(getClass().getResource("combodia.png"));
    ImageIcon congo = new ImageIcon(getClass().getResource("congo.png"));
    ImageIcon crotia = new ImageIcon(getClass().getResource("crotia.png"));
    ImageIcon egypt = new ImageIcon(getClass().getResource("egypt-flag.jpg"));
    ImageIcon estonia = new ImageIcon(getClass().getResource("estonia.png"));
    ImageIcon ethiopia = new ImageIcon(getClass().getResource("ethiopia.png"));
    ImageIcon finland = new ImageIcon(getClass().getResource("finland.png"));
    ImageIcon france = new ImageIcon(getClass().getResource("france.png"));

    ImageIcon germany = new ImageIcon(getClass().getResource("germany.png"));
    ImageIcon greece = new ImageIcon(getClass().getResource("greece.png"));
    ImageIcon iceland = new ImageIcon(getClass().getResource("1irland.png"));
    ImageIcon uk = new ImageIcon(getClass().getResource("1uk.png"));
    ImageIcon us = new ImageIcon(getClass().getResource("1us.png"));

    
    ImageIcon ecuador = new ImageIcon(getClass().getResource("1Ecuador.png"));
    ImageIcon aruba = new ImageIcon(getClass().getResource("1aruba.png"));
    ImageIcon belarus = new ImageIcon(getClass().getResource("1belarus.png"));
    ImageIcon bolivia = new ImageIcon(getClass().getResource("1bolivia.png"));
    ImageIcon bulgaria = new ImageIcon(getClass().getResource("1bulgaria.png"));
    ImageIcon cameron = new ImageIcon(getClass().getResource("1cameron.png"));
    ImageIcon chile = new ImageIcon(getClass().getResource("1chile.png"));
    ImageIcon colombia = new ImageIcon(getClass().getResource("1colombia.png"));
    ImageIcon cominicanrepublic = new ImageIcon(getClass().getResource("1cominican-republic.png"));
    ImageIcon comoros = new ImageIcon(getClass().getResource("1comoros.png"));
    ImageIcon costarica = new ImageIcon(getClass().getResource("1costa-rica.png"));
    ImageIcon cuba = new ImageIcon(getClass().getResource("1cuba.png"));
    ImageIcon czechrepublic = new ImageIcon(getClass().getResource("1czech republic.png"));
    ImageIcon denmark = new ImageIcon(getClass().getResource("1denmark.png"));
    ImageIcon djibouti = new ImageIcon(getClass().getResource("1djibouti.png"));
    ImageIcon dominica = new ImageIcon(getClass().getResource("1dominica.png"));
    ImageIcon easttimor = new ImageIcon(getClass().getResource("1east-timor.png"));
    ImageIcon elsalvador = new ImageIcon(getClass().getResource("1el-salvador.png"));
    ImageIcon gabon = new ImageIcon(getClass().getResource("1gabon.png"));
    ImageIcon gambia = new ImageIcon(getClass().getResource("1gambia.png"));
    ImageIcon georgia = new ImageIcon(getClass().getResource("1georgia.png"));
    ImageIcon ghana = new ImageIcon(getClass().getResource("1ghana.png"));
    ImageIcon greenland = new ImageIcon(getClass().getResource("1greenland.png"));
    ImageIcon guinea = new ImageIcon(getClass().getResource("1guinea.png"));
    ImageIcon guyana = new ImageIcon(getClass().getResource("1guyana.png"));
    ImageIcon honduras = new ImageIcon(getClass().getResource("1honduras.png"));
    ImageIcon hungary = new ImageIcon(getClass().getResource("1hungary.png"));
    ImageIcon capeverde = new ImageIcon(getClass().getResource("cape-verde.png"));
  
    ImageIcon iceland1 = new ImageIcon(getClass().getResource("1iceland.png"));
    ImageIcon england = new ImageIcon(getClass().getResource("1ingland.png"));
    ImageIcon iran = new ImageIcon(getClass().getResource("1iran.png"));
    ImageIcon iraq = new ImageIcon(getClass().getResource("1iraq.png"));
    ImageIcon isreal = new ImageIcon(getClass().getResource("1isreal.png"));
    ImageIcon italy = new ImageIcon(getClass().getResource("1italy.png"));
    ImageIcon jamaica = new ImageIcon(getClass().getResource("1jamaica.png"));
    ImageIcon jordan = new ImageIcon(getClass().getResource("1jordan.png"));
    ImageIcon kazakhstan = new ImageIcon(getClass().getResource("1kazakhstan.png"));
    ImageIcon kenya = new ImageIcon(getClass().getResource("1kenya.png"));
    ImageIcon kiribati = new ImageIcon(getClass().getResource("1kiribati.png"));
    ImageIcon kosovo = new ImageIcon(getClass().getResource("1kosovo.png"));
    ImageIcon kuite = new ImageIcon(getClass().getResource("1kuite.png"));
    ImageIcon kyrgyzstan = new ImageIcon(getClass().getResource("1kyrgyzstan.png"));
    ImageIcon laos = new ImageIcon(getClass().getResource("1laos.png"));
    ImageIcon lativia = new ImageIcon(getClass().getResource("1lativia.png"));
    ImageIcon lebanon = new ImageIcon(getClass().getResource("1lebanon.png"));
    ImageIcon lesotho = new ImageIcon(getClass().getResource("1lesotho.png"));
    ImageIcon libria = new ImageIcon(getClass().getResource("1liberia.png"));
    ImageIcon libya = new ImageIcon(getClass().getResource("1libya.png"));
    ImageIcon malawi = new ImageIcon(getClass().getResource("1malawi.png"));
    ImageIcon malaysia = new ImageIcon(getClass().getResource("1malaysia.png"));
    ImageIcon maldives = new ImageIcon(getClass().getResource("1maldives.png"));
    ImageIcon mali = new ImageIcon(getClass().getResource("1mali.png"));
    ImageIcon marshalislands = new ImageIcon(getClass().getResource("1marshal-islands.png"));
    ImageIcon mauritius = new ImageIcon(getClass().getResource("1mauritius.png"));
    ImageIcon mexico = new ImageIcon(getClass().getResource("1mexico.png"));
    ImageIcon botswana = new ImageIcon(getClass().getResource("botswana.png"));
    ImageIcon chad = new ImageIcon(getClass().getResource("chad.png"));

    
    Image kazakhstanimage = kazakhstan.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image kenyaimage = kenya.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image kiribatiimage = kiribati.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image kosovoimage = kosovo.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image kuiteimage = kuite.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image kyrgyzstanimage = kyrgyzstan.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image laosimage = laos.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image lativiaimage = lativia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image lebanonimage = lebanon.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image lesothoimage = lesotho.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image libriaimage = libria.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image libyaimage = libya.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image malawiimage = malawi.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image malaysiaimage = malaysia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image maldivesimage = maldives.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image maliimage = mali.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image marshalislandsimage = marshalislands.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image mauritiusimage = mauritius.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image mexicoimage = mexico.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image botswanaimage = botswana.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image chadimage = chad.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image iceland1image = iceland1.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image englandimage = england.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image iraqimage = iraq.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image iranimage = iran.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image isrealimage = isreal.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image italyimage = italy.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image jamaicaimage = jamaica.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image jordanimage = jordan.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    
    Image germanyimage = germany.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image greeceimage = greece.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image icelandimage = iceland.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image ukimage = uk.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image usimage = us.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    Image afganimage = afgan.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image andoraimage = andora.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image angolaimage = angola.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    Image argentinaimage = argentina.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image barbadosimage = barbados.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image beninimage = benin.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    Image belgumeimage = belgume.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image brazilimage = brazil.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image burundiimage = burundi.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image butanimage = butan.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    Image canadaimage = canada.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image chinaimage = china.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image combodiaimage = combodia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    Image congoimage = congo.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image crotiaimage = crotia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image egyptimage = egypt.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    Image estoniaimage = estonia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image ethiopiaimage = ethiopia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image finlandimage = finland.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image franceimage = france.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    
    
    //scaling or adjusting image size
    Image ecuadorimage = ecuador.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image arubaimage = aruba.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image belarusimage = belarus.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image boliviaimage = bolivia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image bulgariaimage = bulgaria.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image cameronimage = cameron.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image chileimage = chile.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image colombiaimage = colombia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image cominicanrepublicimage = cominicanrepublic.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image comorosimage = comoros.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image costaricaimage = costarica.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image cubaimage = cuba.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image czechrepublicimage = czechrepublic.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image denmarkimage = denmark.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image djiboutiimage = djibouti.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image dominicaimage = dominica.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image easttimorimage = easttimor.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image elsalvadorimage = elsalvador.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image gabonimage = gabon.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image gambiaimage = gambia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image georgiaimage = georgia.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image ghanaimage = ghana.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image greenlandimage = greenland.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image guineaimage = guinea.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image guyanaimage = guyana.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image hondurasimage = honduras.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image hungaryimage = hungary.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);
    Image irlandimage = capeverde.getImage().getScaledInstance(IMAGEWIDTH, IMAGEHEIGHT, java.awt.Image.SCALE_SMOOTH);

    JButton[] button = new JButton[4];
    String[] flagname = {"Afganistian", "Butan", "Andora", "Angola", "Argentina", "Barbados", "Benin", "Belgume", "Brazil", "Burundi", "Canada", "China", "Combodia", "Congo", "Crotia", "Egypt", "Estonia", "Ethiopia", "Finland", "France", "Germany", "Greece", "Iceland", "UK", "USA",
    "Ecuador", "Aruba", "Belarus", "Bolivia", "Bulgaria", "Cameron", "Chile", "Colombia", "Cominican Republic", "Comoros", "Costa Rica", "Cuba", "Czech Republic", "Denmark", "Djibouti", "Dominica", "East Timor", "El Salvador", "Gabon", "Gambia", "Georgia", "Ghana", "Greenland", "Guinea", "Guyana", "Honduras", "Hungary", "Cape Verde",
    "Iceland","England","Iran","Iraq","Isreal","Italy","Jamaica","Jordan","Kazakhstan","Kenya","Kiribati","Kosovo","Kuite","Kyrgyzstan","Laos","Lativia","Lebanon","Lesotho","Libria","Libya","Malawi","Malaysia","Maldives","Mali","Marshal Islannds","Mauritius","Mexico","Chad","Botswana"};
    int[] choose = new int[4];
    int flagnamerandom, minute, second, scorecounter = 0;//flagnamerandom variable gets name randomly from selected Flags
    int guesscounter = 0;//count number of clicks and privent from clicking more than 2 flags in one round 

    JPanel p1, p2, p3, p4;

    JLabel label1 = new JLabel("Guess Flag of the Country");
    JLabel label2, timelabel;//timelabel display time

    Font font = new Font("SansSerif", 3, 25);
    Timer timer;

    ImageIcon[] icon = new ImageIcon[82];
    static JFrame frame;

    GuessingFlag() {
        
        super("Guessing Flag");
  
        icon[25] = new ImageIcon(ecuadorimage);
        icon[26] = new ImageIcon(arubaimage);
        icon[27] = new ImageIcon(belarusimage);
        icon[28] = new ImageIcon(boliviaimage);
        icon[29] = new ImageIcon(bulgariaimage);
        icon[30] = new ImageIcon(cameronimage);
        icon[31] = new ImageIcon(chileimage);
        icon[32] = new ImageIcon(colombiaimage);
        icon[33] = new ImageIcon(cominicanrepublicimage);
        icon[34] = new ImageIcon(comorosimage);
        icon[35] = new ImageIcon(costaricaimage);
        icon[36] = new ImageIcon(cubaimage);
        icon[37] = new ImageIcon(czechrepublicimage);
        icon[38] = new ImageIcon(denmarkimage);
        icon[39] = new ImageIcon(djiboutiimage);
        icon[40] = new ImageIcon(dominicaimage);
        icon[41] = new ImageIcon(easttimorimage);
        icon[42] = new ImageIcon(elsalvadorimage);
        icon[43] = new ImageIcon(gabonimage);
        icon[44] = new ImageIcon(gambiaimage);
        icon[45] = new ImageIcon(georgiaimage);
        icon[46] = new ImageIcon(ghanaimage);
        icon[47] = new ImageIcon(greenlandimage);
        icon[48] = new ImageIcon(guineaimage);
        icon[49] = new ImageIcon(guyanaimage);
        icon[50] = new ImageIcon(hondurasimage);
        icon[51] = new ImageIcon(hungaryimage);
        icon[52] = new ImageIcon(irlandimage);
        
        icon[53] = new ImageIcon(iceland1image);
        icon[54] = new ImageIcon(englandimage);
        icon[55] = new ImageIcon(iranimage);
        icon[56] = new ImageIcon(iraqimage);
        icon[57] = new ImageIcon(isrealimage);
        icon[58] = new ImageIcon(italyimage);
        icon[59] = new ImageIcon(jamaicaimage);
        icon[60] = new ImageIcon(jordanimage);
        icon[61] = new ImageIcon(kazakhstanimage);
        icon[62] = new ImageIcon(kenyaimage);
        icon[63] = new ImageIcon(kiribatiimage);
        icon[64] = new ImageIcon(kosovoimage);
        icon[65] = new ImageIcon(kuiteimage);
        icon[66] = new ImageIcon(kyrgyzstanimage);
        icon[67] = new ImageIcon(laosimage);
        icon[68] = new ImageIcon(lativiaimage);
        icon[69] = new ImageIcon(lebanonimage);
        icon[70] = new ImageIcon(lesothoimage);
        icon[71] = new ImageIcon(libriaimage);
        icon[72] = new ImageIcon(libyaimage);
        icon[73] = new ImageIcon(malawiimage);
        icon[74] = new ImageIcon(malaysiaimage);
        icon[75] = new ImageIcon(maldivesimage);
        icon[76] = new ImageIcon(maliimage);
        icon[77] = new ImageIcon(marshalislandsimage);
        icon[78] = new ImageIcon(mauritiusimage);
        icon[79] = new ImageIcon(mexicoimage);
        icon[80] = new ImageIcon(chadimage);
        icon[81] = new ImageIcon(botswanaimage);
        
        
        icon[0] = new ImageIcon(afganimage);
        icon[1] = new ImageIcon(butanimage);
        icon[2] = new ImageIcon(andoraimage);
        icon[3] = new ImageIcon(angolaimage);
        icon[4] = new ImageIcon(argentinaimage);
        icon[5] = new ImageIcon(barbadosimage);
        icon[6] = new ImageIcon(beninimage);
        icon[7] = new ImageIcon(belgumeimage);
        icon[8] = new ImageIcon(brazilimage);
        icon[9] = new ImageIcon(burundiimage);
        icon[10] = new ImageIcon(canadaimage);
        icon[11] = new ImageIcon(chinaimage);
        icon[12] = new ImageIcon(combodiaimage);
        icon[13] = new ImageIcon(congoimage);
        icon[14] = new ImageIcon(crotiaimage);
        icon[15] = new ImageIcon(egyptimage);
        icon[16] = new ImageIcon(estoniaimage);
        icon[17] = new ImageIcon(ethiopiaimage);
        icon[18] = new ImageIcon(finlandimage);
        icon[19] = new ImageIcon(franceimage);
        icon[20] = new ImageIcon(germanyimage);
        icon[21] = new ImageIcon(greeceimage);
        icon[22] = new ImageIcon(icelandimage);
        icon[23] = new ImageIcon(ukimage);
        icon[24] = new ImageIcon(usimage);


        for (int i = 0; i < 4; i++) {
            button[i] = new JButton();
        }

        p1 = new JPanel(new GridLayout(1, 4, 5, 5));
        p1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        get4RandomNumber();

        for (int i = 0; i < 4; i++) {
            button[i].setIcon(icon[choose[i]]);
        }

        for (int i = 0; i < 4; i++) {
            p1.add(button[i]);
        }

        p2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        p2.setBackground(Color.CYAN);
        
        label1.setFont(font);
        label1.setForeground(Color.GRAY);
        label2 = new JLabel();
        label2.setText(flagname[choose[flagnamerandom]]);
        label2.setFont(new Font("Serif", 2, 44));
        label2.setForeground(Color.BLUE);

        p2.setBorder(new TitledBorder("Flag Name"));
        p2.add(label1);
        p2.add(label2);

        p4 = new JPanel(new BorderLayout());

        p4.setBackground(Color.black);
        p4.setBorder(new LineBorder(Color.LIGHT_GRAY, 10));

        timelabel = new DateDisplay();
        timelabel.setForeground(Color.WHITE);
        timelabel.setFont(new Font("Serif", 3, 54));

        p4.add(timelabel);

        p3 = new JPanel(new GridLayout(1, 2));

        p3.add(p2);
        p3.add(p4);

        add(p1, BorderLayout.NORTH);
        add(p3, BorderLayout.CENTER);

        FlagsListener listener = new FlagsListener();

        for (int i = 0; i < 4; i++) {
            button[i].addActionListener(listener);
        }

    }

    public static void main(String[] args) {
        frame = new GuessingFlag();

        frame.setSize(1350, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    //generating 4 Random flags without repeat and select country name randomly from the Selected Flags
    private void get4RandomNumber() {

        for (int i = 0; i < 4; i++) {
            choose[i] = (int) (Math.random() * 82);
        }

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    choose[i] = (int) (Math.random() * 82);
                    break;
                case 1:
                    if (choose[0] == choose[1]) {
                        while (true) {
                            choose[i] = (int) (Math.random() * 82);
                            if (choose[0] != choose[1]) {
                                break;
                            }
                        }
                    }   break;
                case 2:
                    if (choose[0] == choose[2] || choose[1] == choose[2]) {
                        while (true) {
                            choose[i] = (int) (Math.random() * 82);
                            if (choose[0] != choose[2] && choose[1] != choose[2]) {
                                break;
                            }
                        }
                    }   break;
                case 3:
                    if (choose[0] == choose[3] || choose[1] == choose[3] || choose[2] == choose[3]) {
                        while (true) {
                            choose[i] = (int) (Math.random() * 82);
                            if (choose[0] != choose[3] && choose[1] != choose[3] && choose[2] != choose[3]) {
                                break;
                            }
                        }
                    }   break;
                default:
                    break;
            }

        }

        for (int i = 0; i < 4; i++) {
            flagnamerandom = (int) (Math.random() * 4);
             
        }
    }

    private void resetGame() {
        minute = 0;
        second = 10;
        timer.start();
        guesscounter = 0;
        get4RandomNumber();

        for (int i = 0; i < 4; i++) {
            button[i].setIcon(icon[choose[i]]);
             
        }

        label2.setText(flagname[choose[flagnamerandom]]);
        
    }

    public class DateDisplay extends JLabel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString(String.valueOf("0" + minute + ":" + "0" + second), getWidth() / 2, getHeight() / 2);
        }

        DateDisplay() {
            timer = new Timer(1000, new TimerListener());
            second = 9;
            minute = 0;
            timer.start();
        }

        DateDisplay(String s) {
            second = 6;
            minute = 0;
            timer.restart();
        }

        public class TimerListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                second--;
                if (second >= 0) {
                    repaint();
                }
                if (second == 0) {
                    timer.stop();
                    int bestscore = storeScore(scorecounter);
                    
                    if (bestscore <= scorecounter) {
                        JOptionPane.showMessageDialog(null, "HighScore = " + bestscore + 
                                " \nyour score = " + scorecounter + "\nnew record !!");
                    } else {
                         JOptionPane.showMessageDialog(null, "HighScore = " + bestscore + 
                                " \nyour score = " + scorecounter);
                    }

                    
                    
                    int yes = JOptionPane.showConfirmDialog(null, "do you went to Continue");

                    switch (yes) {
                        case JOptionPane.YES_OPTION:
                            scorecounter = 0;
                            resetGame();
                            break;
                        case JOptionPane.NO_OPTION:
                            guesscounter = 2;
                            timer.stop();
                            System.exit(0);
                            break;
                        case JOptionPane.CANCEL_OPTION:
                            guesscounter = 2;
                            timer.stop();
                             
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    public class FlagsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 4; i++) {
                if (e.getSource() == button[i]) {

                    guesscounter++;
                    if (guesscounter > 2) {
                        return;
                    }
                    if (i == flagnamerandom) {
                        scorecounter++;
                        resetGame();
                    } else {
                        second = (second / 3 > 0) ? second - 2 : second;
                    }

                }
            }
        }
    }
    
      private int storeScore(int s) {
        File file = new File("score.txt");
        int previousscore = 0;

        if (file.exists()) {
            try {
                DataInputStream inputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                previousscore = inputstream.readInt();

                if (previousscore < s) {
                    previousscore = s;

                    DataOutputStream outstream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

                    outstream.writeInt(s);

                    outstream.close();
                    inputstream.close();

                    return previousscore;
                }
            } catch (IOException ex) {

            }
        } else {
            try {
                DataOutputStream outputstream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                outputstream.writeInt(s);
                outputstream.close();
                return s;
            } catch (IOException ex) {

            }
        }

        return previousscore;
    }
}
