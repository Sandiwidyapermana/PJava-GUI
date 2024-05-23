import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Font;

public class App {
  public static void main(String[] args) throws Exception {
    
    // frame
    JFrame mainWindow = new JFrame();
    mainWindow.setSize(1920, 1080);
    mainWindow.setTitle("Frame Utama");
    mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainWindow.setLayout(null);
    mainWindow.setLocationRelativeTo(null);
    
    // Panel
    JPanel sidebar = new JPanel();
    sidebar.setSize(200, 1080);
    sidebar.setBackground( new Color(23, 35, 51) );
    sidebar.setLayout(null);
    
    JPanel header = new JPanel();
    header.setBounds(200, 0, 1920, 70);
    header.setBackground(new Color(71, 120, 197));
    header.setLayout(null);

    JPanel content = new JPanel();
    content.setBounds(200, 70, 1920, 1080);
    content.setBackground(Color.WHITE);
    content.setLayout(null);

    // Ini component
    JLabel title = new JLabel("Isi Data User");
    title.setBounds(20, 20, 300, 30);
    title.setFont(new Font("Poppins Bold", Font.PLAIN, 30));

    JLabel nama = new JLabel("Nama");
    nama.setBounds(20, 70, 300, 20);
    nama.setFont(new Font("Poppins Medium", Font.PLAIN, 20 ));

    JTextField txtNama = new JTextField();
    txtNama.setBounds(20, 100, 500, 30);
    txtNama.setFont(new Font("Poppins", Font.PLAIN, 16));

    JLabel username = new JLabel("Username");
    username.setBounds(20, (int)txtNama.getLocation().getY()+45, 300, 20);
    username.setFont(new Font("Poppins Medium", Font.PLAIN, 20 ));

    JTextField txtUsername = new JTextField();
    txtUsername.setBounds(20, (int)username.getLocation().getY()+30, 500, 30);
    txtUsername.setFont(new Font("Poppins", Font.PLAIN, 16));
    
    JLabel password = new JLabel("Password");
    password.setBounds(20, (int)txtUsername.getLocation().getY()+45, 300, 20);
    password.setFont(new Font("Poppins Medium", Font.PLAIN, 20 ));
    
    JPasswordField txtPassword = new JPasswordField();
    txtPassword.setBounds(20, (int)password.getLocation().getY()+30, 500, 30);
    txtPassword.setFont(new Font("Poppins", Font.PLAIN, 16 ));

    JLabel alamat = new JLabel("Alamat");
    alamat.setBounds(20, (int)txtPassword.getLocation().getY()+45, 300, 20);
    alamat.setFont(new Font("Poppins Medium", Font.PLAIN, 20 ));

    JTextArea txtAlamat = new JTextArea();
    txtAlamat.setFont(new Font("Poppins", Font.PLAIN, 16 ));
    txtAlamat.setLineWrap(true);
    txtAlamat.setWrapStyleWord(true);

    JScrollPane scrollTxtAlamat = new JScrollPane(txtAlamat);
    scrollTxtAlamat.setBounds(20, (int)alamat.getLocation().getY()+30, 500, 100);
    scrollTxtAlamat.setViewportView(txtAlamat);

    JLabel jk = new JLabel("Jenis Kelamin");
    jk.setBounds(20, (int)scrollTxtAlamat.getLocation().getY()+115, 300, 20);
    jk.setFont(new Font("Poppins Medium", Font.PLAIN, 20 ));

    JRadioButton rdPria = new JRadioButton("Pria");
    rdPria.setBounds(20, (int)jk.getLocation().getY()+20, 100, 30);
    rdPria.setFont( new Font("Poppins", Font.PLAIN, 16) );
    rdPria.setBackground( new Color(255,255,255) );

    JRadioButton rdWanita = new JRadioButton("Wanita");
    rdWanita.setBounds(120, (int)jk.getLocation().getY()+20, 130, 30);
    rdWanita.setFont( new Font("Poppins", Font.PLAIN, 16) );
    rdWanita.setBackground( new Color(255,255,255) );

    ButtonGroup groupJK = new ButtonGroup();
    groupJK.add(rdPria);
    groupJK.add(rdWanita);

    JLabel hobi = new JLabel("Hobi");
    hobi.setBounds(20, (int)rdWanita.getLocation().getY()+40, 300, 20);
    hobi.setFont(new Font("Poppins Medium", Font.PLAIN, 20 ));

    JCheckBox chFullRebahan = new JCheckBox("Full Rebahan");
    chFullRebahan.setBounds(20, (int)hobi.getLocation().getY()+20, 130, 30);
    chFullRebahan.setFont( new Font("Poppins", Font.PLAIN, 16) );
    chFullRebahan.setBackground( new Color(255,255,255) );

    JCheckBox chEditor = new JCheckBox("Editor");
    chEditor.setBounds(150, (int)hobi.getLocation().getY()+20, 130, 30);
    chEditor.setFont( new Font("Poppins", Font.PLAIN, 16) );
    chEditor.setBackground( new Color(255,255,255) );

    JCheckBox chTouring = new JCheckBox("Touring");
    chTouring.setBounds(280, (int)hobi.getLocation().getY()+20, 130, 30);
    chTouring.setFont( new Font("Poppins", Font.PLAIN, 16) );
    chTouring.setBackground( new Color(255,255,255) );

    JCheckBox chBlogger = new JCheckBox("Blogger");
    chBlogger.setBounds(410, (int)hobi.getLocation().getY()+20, 130, 30);
    chBlogger.setFont( new Font("Poppins", Font.PLAIN, 16) );
    chBlogger.setBackground( new Color(255,255,255) );

    JCheckBox chStalkingEx = new JCheckBox("Stalking Ex");
    chStalkingEx.setBounds(540, (int)hobi.getLocation().getY()+20, 130, 30);
    chStalkingEx.setFont( new Font("Poppins", Font.PLAIN, 16) );
    chStalkingEx.setBackground( new Color(255,255,255) );

    JLabel negara = new JLabel("Negara");
    negara.setBounds(800, 70, 300, 25);
    negara.setFont(new Font("Poppins Medium", Font.PLAIN, 20 ));

    String pilihanNegara[] = {"Pilih Negara", "Zimbabwe", "Mesir", "Kamerun", "Afrika Selatan", "Ghana", "Senegal", "Tanzania", "Kongo", "Nigeria", "Ethiopia", "Senegal", "Togo", "Lesotho", "Libya", "Kamerun", "Madagaskar", "Burundi"};
    JComboBox<String> cmbnegara = new JComboBox<String>(pilihanNegara);
    cmbnegara.setFont( new Font("Poppins", Font.PLAIN, 16) );
    cmbnegara.setBounds(800, (int)negara.getLocation().getY()+30, 400, 30);
    cmbnegara.setBackground(Color.WHITE);
    
    JLabel pengalamanpekerjaan = new JLabel("Pengalaman Pekerjaan");
    pengalamanpekerjaan.setBounds(800, (int)cmbnegara.getLocation().getY()+40, 300, 25);
    pengalamanpekerjaan.setFont(new Font("Poppins Medium", Font.PLAIN, 20 ));

    String listPekerjaan[] = {"Kerja Bakti", "Kerja Kelompok", "Kerja Rodi", "Kerja Sama", "Dipekerjakan", "Kerja Shift Malam", "Polwan"};
    JList<String> lsPekerjaan = new JList<String>(listPekerjaan);
    lsPekerjaan.setFont(new Font("Poppins", Font.PLAIN, 16));

    JScrollPane scrollLsPekerjaan = new JScrollPane(lsPekerjaan);
    scrollLsPekerjaan.setBounds(800, (int)pengalamanpekerjaan.getLocation().getY()+30, 400, 100);

    JButton btnSubmit = new JButton("Submit");
    btnSubmit.setFont( new Font("Poppins", Font.PLAIN, 16) );
    btnSubmit.setBounds(800, (int)scrollLsPekerjaan.getLocation().getY()+115, 100, 40);
    btnSubmit.setBackground( new Color(71, 120, 197) );
    btnSubmit.setForeground( Color.WHITE );


    // Event handling
    // Buat objek action listener
    // ActionListener clickButton = new ActionListener(){
    // @Override
    // Public void actionPerformed( ActionEvent e ){
    // Response
    // System.out.println("ok");
    //  }
    //  };


    btnSubmit.addActionListener( new ActionListener(){
      @Override
      public void actionPerformed( ActionEvent ae ){
        // getter value dari inputan
        // getter value JTextField
        String nama = txtNama.getText();
        String username = txtNama.getText();

        // Getter value JPasswordField
        String password = String.valueOf(txtPassword.getPassword());
        // Getter value JTextarea
        String alamat = txtAlamat.getText();
        String jk = "";
        String hobi = "";
        // Getter value JComboBox
        String negara = cmbnegara.getSelectedItem().toString();
        String pekerjaan = "";
        
        // Getter value JRadioButton
        try {
          jk = groupJK.getSelection().getActionCommand();
        } catch (Exception e) {
          JOptionPane.showMessageDialog( mainWindow, "Pilih jenis kelamin", "Peringatan", JOptionPane.WARNING_MESSAGE );
          return;
        }
        
        // Cek seleksi pada JCheckbox
        if( chFullRebahan.isSelected() ){
          hobi += "Full Rebahan";
        }
        if( chEditor.isSelected() ){
          hobi += "Editor";
        }
        if( chTouring.isSelected() ){
          hobi += "Touring";
        }
        if( chBlogger.isSelected() ){
          hobi += "Blogger";
        }
        if( chStalkingEx.isSelected() ){
          hobi += "Stalking";
        }

        // Getter Index yang terseleksi pada JList
        int indexSelecteds[] = lsPekerjaan.getSelectedIndices();
        for( int i = 0; i < indexSelecteds.length; i++ ){
          pekerjaan += lsPekerjaan.getModel().getElementAt(indexSelecteds[i]) + ",";
        }
        
        

        String message = 
          "Nama : " + nama + "\n"
          + "Username : " + username + "\n"
          + "Password : " + password + "\n"
          + "Alamat : " + alamat + "\n"
          + "Jenis Kelamin : " + jk + "\n"
          + "Hobi : " + hobi + "\n"
          + "Negara : " + negara + "\n"
          + "Pengalaman Pekerjaan : " + pekerjaan + "\n"
        ;

        JOptionPane.showMessageDialog(
          mainWindow,
          message,
          "Hasil inputan",
          JOptionPane.INFORMATION_MESSAGE
        );

      }
    } );








    // Finally
    content.add(title);
    content.add(nama);
    content.add(txtNama);
    content.add(username);
    content.add(txtUsername);
    content.add(password);
    content.add(txtPassword);
    content.add(alamat);
    content.add(scrollTxtAlamat);
    content.add(jk);
    content.add(rdPria);
    content.add(rdWanita);
    content.add(hobi);
    content.add(chFullRebahan);
    content.add(chEditor);
    content.add(chTouring);
    content.add(chBlogger);
    content.add(chStalkingEx);
    content.add(negara);
    content.add(cmbnegara);
    content.add(pengalamanpekerjaan);
    content.add(scrollLsPekerjaan);
    content.add(btnSubmit);
    mainWindow.add(sidebar);
    mainWindow.add(header);
    mainWindow.add(content);
    mainWindow.setVisible(true);


    // JOptionPane.showMessageDialog(mainWindow, "Anda berhasil membuka aplikasi", "Informasi Berhasil", JOptionPane.INFORMATION_MESSAGE);

    // int konfirmasi = JOptionPane.showConfirmDialog(mainWindow, "Yakin ingin membuka aplikasi", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

    // String inputValue = JOptionPane.showInputDialog("Please input a value");

    // Object[] possibleValues = { "First", "Second", "Third" };

    // Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[1]);

    // Object[] options = { "IYA", "TIDAK", "BATAL" };
    // JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);



  }
}
