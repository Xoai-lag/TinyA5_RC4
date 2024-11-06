package tiny_rc;

import java.util.ArrayList;
import java.util.Arrays;

public class Tiny_A5 extends javax.swing.JFrame {

    public Tiny_A5() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        keyhuh = new javax.swing.JTextField();
        Decryption = new javax.swing.JButton();
        Encryption = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        encryption = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        decryption = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Key:");

        text.setColumns(20);
        text.setRows(5);
        jScrollPane3.setViewportView(text);

        keyhuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyhuhActionPerformed(evt);
            }
        });

        Decryption.setText("Decryption");
        Decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptionActionPerformed(evt);
            }
        });

        Encryption.setText("Encryption");
        Encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nhập Dữ Liệu: ");

        encryption.setColumns(20);
        encryption.setRows(5);
        jScrollPane1.setViewportView(encryption);

        decryption.setColumns(20);
        decryption.setRows(5);
        jScrollPane2.setViewportView(decryption);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nhập Key có 8 kí tự");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(keyhuh, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Encryption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Decryption)
                        .addGap(51, 51, 51)))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyhuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Decryption)
                    .addComponent(Encryption))
                .addGap(58, 58, 58))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Sinh ra StreamKey bằng cách bỏ phiếu và xor
    private int[] streamkey() {
        //Lấy key nhập vào
        String input = keyhuh.getText().replace(" ", "");
        StringBuilder binaryStringBuilder = new StringBuilder();

        if (input.length() > 8) {
            input = input.substring(0, 8); // Lấy 8 ký tự đầu tiên
        }
        //Chuyển đổi chuỗi key kí tự thành chuỗi key nhị phân 
        for (char c : input.toCharArray()) {
            // Lấy mã ASCII và chuyển đổi sang nhị phân
            String binary = String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'); // Lấy 8 bit cuối
            binaryStringBuilder.append(binary); // Thêm vào chuỗi nhị phân
        }

        //Khỏi tạo các thanh ghi
        int[] R1 = new int[19];
        int[] R2 = new int[22];
        int[] R3 = new int[23];

        //Duyệt hết chuỗi nhị phân key và xor lần lượt các phần tử trong chuỗi với phần tử ở đầu mỗi thanh ghi và đẩy kết quả vào thanh ghi
        for (int i = 0; i < binaryStringBuilder.length(); i++) {
            int bit = Character.getNumericValue(binaryStringBuilder.charAt(i));
            R1 = addfirst(R1, (bit ^ R1[0]));
            R2 = addfirst(R2, (bit ^ R2[0]));
            R3 = addfirst(R3, (bit ^ R3[0]));
        }

        //Lấy chuỗi đầu vào 
        String textinput = text.getText().replace(" ", "");

        //Khởi tạo độ dài cho StreamKey vừa bằng độ dài số bit của chuỗi đầu vào
        int sobitkey = textinput.length() * 8;
        int[] StreamKey = new int[sobitkey];

        //Duyệt lấy số lượng bit cho StreamKey bằng với độ dài số bit của chuỗi đầu vào bằng cách bỏ phiếu, xoay các thanh ghi và xor các phần tử cuối
        for (int i = 0; i < sobitkey; i++) {
            int flag = major(R1[8], R2[10], R3[10]);
            if (R1[8] == flag) {
                int bitxor = xorR1(R1);
                R1 = addfirst(R1, bitxor); // Xoay thanh ghi R1
            }
            if (R2[10] == flag) {
                int bitxor = xorR2(R2);
                R2 = addfirst(R2, bitxor);// Xoay thanh ghi R2
            }
            if (R3[10] == flag) {
                int bitxor = xorR3(R3);
                R3 = addfirst(R3, bitxor);// Xoay thanh ghi R3
            }
            StreamKey[i] = (R1[R1.length - 1] ^ R2[R2.length - 1] ^ R3[R3.length - 1]);//XOR các phần tử ở cuối các thanh ghi lưu vào StreamKey
        }
        return StreamKey;
    }

    //Xử lí việc bỏ phiếu
    private int major(int a, int b, int c) {
        if (a == b && a != c) {
            return a;
        }
        if (a == c && a != b) {
            return a;
        }
        if (b == c && b != a) {
            return b;
        }
        if (a == b && b == c) {
            return a;
        } else {
            return -1;
        }
    }

    //Đẩy các phần tử của mảng sang phải và thêm phần tử vào đầu mảng, xóa phần tử ở cuối để duy trì độ dài của mảng
    public static int[] addfirst(int[] a, int x) {
        int[] result = new int[a.length];

        // Chèn `x` vào đầu
        result[0] = x;
        for (int i = 1; i < a.length; i++) {
            result[i] = a[i - 1]; // Dịch các phần tử còn lại sang phải
        }

        return result;
    }

    //Phương Thức Xoay của 3 thanh ghi 
    private int xorR1(int[] a) {
        return ((a[18] ^ a[17]) ^ a[16]) ^ a[13];
    }

    private int xorR2(int[] a) {
        return a[21] ^ a[20];
    }

    private int xorR3(int[] a) {
        return ((a[22] ^ a[21]) ^ a[20]) ^ a[7];
    }

    private void keyhuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyhuhActionPerformed

    }//GEN-LAST:event_keyhuhActionPerformed

    private void EncryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptionActionPerformed
        int[] StreamKey = streamkey(); //Tạo ra StreamKey
        String input = text.getText().replace(" ", "");//Lấy văn bản đầu vào
        StringBuilder binaryStringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            // Lấy mã ASCII và chuyển đổi sang nhị phân
            String binary = String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0'); // Lấy 8 bit cuối
            binaryStringBuilder.append(binary); // Thêm vào chuỗi nhị phân
        }
        //Tạo mảng để lưu kết quả 
        int[] result = new int[binaryStringBuilder.length()];
        for (int i = 0; i < binaryStringBuilder.length(); i++) {
            int bit = Character.getNumericValue(binaryStringBuilder.charAt(i));// lấy bit của văn bản ở vị trí i
            result[i] = StreamKey[i] ^ bit;//XOR bit của StreamKey tại i với bit của văn bản tại i lưu kết quả vào result vị trí i
        }
        // Chuyển đổi mảng result thành chuỗi ASCII
        StringBuilder asciiStringBuilder = new StringBuilder();
        for (int i = 0; i < result.length; i += 8) {
            StringBuilder byteString = new StringBuilder();

            // Lấy 8 bit và chuyển thành chuỗi
            for (int j = 0; j < 8 && (i + j) < result.length; j++) {
                byteString.append(result[i + j]);
            }

            // Chuyển chuỗi nhị phân thành số thập phân và sau đó là ký tự ASCII
            int asciiValue = Integer.parseInt(byteString.toString(), 2);
            asciiStringBuilder.append((char) asciiValue);
        }

        // Hiển thị kết quả mã hóa dạng ASCII trong text field 'encryption'
        encryption.setText(asciiStringBuilder.toString());
    }//GEN-LAST:event_EncryptionActionPerformed

    private void DecryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptionActionPerformed
        int[] StreamKey = streamkey();
        String input = text.getText();
        StringBuilder binaryStringBuilder = new StringBuilder();

        // Chuyển chuỗi ASCII mã hóa thành chuỗi nhị phân
        for (char c : input.toCharArray()) {
            String binary = String.format("%8s", Integer.toBinaryString(c & 0xFF)).replace(' ', '0');
            binaryStringBuilder.append(binary);
        }

        int[] decryptedBits = new int[binaryStringBuilder.length()];
        for (int i = 0; i < binaryStringBuilder.length(); i++) {
            int bit = Character.getNumericValue(binaryStringBuilder.charAt(i));
            decryptedBits[i] = StreamKey[i] ^ bit; // XOR lại với StreamKey để giải mã
        }

        // Chuyển đổi mảng decryptedBits thành chuỗi ASCII
        StringBuilder asciiStringBuilder = new StringBuilder();
        for (int i = 0; i < decryptedBits.length; i += 8) {
            StringBuilder byteString = new StringBuilder();

            // Lấy 8 bit và chuyển thành chuỗi
            for (int j = 0; j < 8 && (i + j) < decryptedBits.length; j++) {
                byteString.append(decryptedBits[i + j]);
            }

            // Chuyển chuỗi nhị phân thành số thập phân và sau đó là ký tự ASCII
            int asciiValue = Integer.parseInt(byteString.toString(), 2);
            asciiStringBuilder.append((char) asciiValue);
        }

        // Hiển thị kết quả giải mã dạng ASCII trong text field 'decryption'
        decryption.setText(asciiStringBuilder.toString());
    }//GEN-LAST:event_DecryptionActionPerformed

    public static void main(String args[]) {
        new Tiny_A5().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Decryption;
    private javax.swing.JButton Encryption;
    private javax.swing.JTextArea decryption;
    private javax.swing.JTextArea encryption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField keyhuh;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
