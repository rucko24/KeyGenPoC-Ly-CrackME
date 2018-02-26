package com.keygenPoC;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.IntStream;


public class KeyGen {

    private static final String ADD = ".2009599811627668E16";
    private String fixme;

    static int[] _$$Y_sy76 = new int[]{7414755, 3219665, 175186692, 136322726, 136419744, 4066036, 15685602, 103481, 8331326, 14522496, 254443529, 117440530, 1048576, 10066673, 15655202, 4330562, 1183806, 11019024, 140529167, 118489840, 19071234, 15728644, 3109537, 594494, 7406141, 9476832, 18812418, 9969838, 34803714, 3298805, 2302368, 15368608, 8916253, 9445024, 51519491, 31, 241696768, 7414181, 2299045, 39441, 9539087, 16392240, 151584912, 117641473, 258080912, 16115104, 1179936, 1052698, 1183501, 7413822, 236060690, 257294849, 125830118, 66016, 8983278, 624289, 16609425, 14844138, 27270816, 239404033, 51389454, 7414690, 593951, 7709524, 9969409, 9847050, 118646528, 158482433, 17891345, 2299045, 2299045, 3739700};
    int _$$2341s = 0;

    public KeyGen() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, MalformedURLException {
        String _DEFF_$ = "ABDHGS61" + (new Random()).nextInt(10) + "51129018N00S";
        String _IX$ = "";
        String _DEFF_$2 = "2ODNWOF92H823ONEI2332";
        boolean _$_$2edwb$ = true;
        while (true) {
            while (true) {
                int _stax$;
                byte _yx$;
                int _index$;
                do {
                    if (!_$_$2edwb$) {
                        final String op = System.getProperty("os.name");
                        if(op.startsWith("Win")) {
                            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                        }else {
                            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        }
                        final JFrame _$$f_dwquig11__ = new JFrame("PoC by rub'n - Ly-Crackme @Leyer");
                        _$$f_dwquig11__.setIconImage(new ImageIcon((KeyGen.class.getClassLoader().getResource("icoImg.png"))).getImage());
                        final JTextField __gXb$ = new JTextField(20);
                        final JTextField _$lH$$j$ = new JTextField(28);
                        _$lH$$j$.setHorizontalAlignment(0);
                        final JButton _$$b__$$hsqqso_ = new JButton("generate key");
                        _$$b__$$hsqqso_.setPreferredSize(new Dimension(120, 25));
                        JLabel x = new JLabel("X = ");
                        JButton fixME = new JButton();
                        fixME.setIcon(new ImageIcon((KeyGen.class.getClassLoader().getResource("fix.png"))));
                        fixME.addActionListener(e -> {
                            _$lH$$j$.setText("");
                            if (fixme != null)
                                _$lH$$j$.setText(fixME(fixme));
                        });
                        final JPanel $$$_Tt$$ = b$u$l$L$_SH$i$T(x, __gXb$, fixME);
                        final JPanel L$oPX$ = b$u$l$L$_SH$i$T(_$lH$$j$);
                        final JPanel EdFAF = b$u$l$L$_SH$i$T(_$$b__$$hsqqso_);
                        _$$f_dwquig11__.add($$$_Tt$$, BorderLayout.NORTH);
                        _$$f_dwquig11__.add(L$oPX$, BorderLayout.CENTER);
                        _$$b__$$hsqqso_.addActionListener( e -> {
                            final String $faHA_$oPL = __gXb$.getText();
                            if ($faHA_$oPL == null || "".equals($faHA_$oPL.trim())) {
                                return;
                            }
                            if (!$faHA_$oPL.matches("[0-9]{0,9}")) {
                                JOptionPane.showMessageDialog(null, "Invalid value");
                            } else {
                                try {
                                    final int shitDesireMyEX = $$1(_$$Y_sy76, Integer.valueOf($faHA_$oPL.trim()));
                                    String _$$c_Cor_ = "";
                                    final int _$_foP = shitDesireMyEX;
                                    for (int _$$i_INDEX_ = 0; _$$i_INDEX_ < _$$Y_sy76.length; ++_$$i_INDEX_) {
                                        if (_$$Y_sy76[_$$i_INDEX_] == _$$Y_sy76[_$_foP]) {
                                            for (int index = 0; index < _$$i_INDEX_; ++index) {
                                                _$$c_Cor_ = _$$c_Cor_ + String.valueOf((byte) _$$Y_sy76[index]);
                                            }
                                            _$$c_Cor_ = _$$as_OIsl(_$$c_Cor_) + String.valueOf(Math.pow(_$$2341s, 2) / 6 - 36);
                                        }
                                    }
                                    _$lH$$j$.setText("");
                                    _$lH$$j$.setText(_$$c_Cor_);
                                    fixme = _$$c_Cor_;
                                    _$$c_Cor_ = "";
                                } catch (NoSuchElementException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid value");
                                }
                            }
                        });
                        _$$f_dwquig11__.add(EdFAF, BorderLayout.SOUTH);
                        _$$f_dwquig11__.setSize(500, 100);
                        _$$f_dwquig11__.pack();
                        _$$f_dwquig11__.setResizable(false);
                        _$$f_dwquig11__.setLocationRelativeTo((Component) null);
                        _$$f_dwquig11__.setDefaultCloseOperation(3);
                        _$$f_dwquig11__.setVisible(true);
                        return;
                    }
                    _stax$ = (new Random()).nextInt((int) Math.pow((double) Integer.parseInt("2ODNWOF92H823ONEI2332".substring(10, 12)), 3.0D));
                    _yx$ = 8;
                } while (_stax$ != Integer.parseInt(String.valueOf(_DEFF_$.charAt(_yx$))));

                for (_index$ = _DEFF_$.length(); _index$ > 1; --_index$) {
                    if (_index$ == Integer.parseInt("2ODNWOF92H823ONEI2332".substring(20))) {
                        _IX$ = _IX$ + _DEFF_$.substring(_DEFF_$.indexOf("0") + 2, _DEFF_$.lastIndexOf("0") - _index$);
                        _$$2341s = (int) Math.pow((double) Integer.parseInt(_IX$), 2.0D) / Integer.parseInt(_DEFF_$.substring(_DEFF_$.lastIndexOf("1") + 1, _DEFF_$.lastIndexOf("N"))) + Integer.parseInt(_DEFF_$.substring(11, 13)) - 2;
                        _$_$2edwb$ = false;
                        break;
                    }
                }
            }
        }
    }

    static String _$$as_OIsl(String _$s_String_) {
        byte[] _$$d_defaultBytes_ = _$s_String_.getBytes();
        MessageDigest _$$a_algorithm = null;
        try {
            _$$a_algorithm = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException var6) {
        }
        _$$a_algorithm.reset();
        _$$a_algorithm.update(_$$d_defaultBytes_);
        byte[] messageDigest = _$$a_algorithm.digest();
        StringBuffer hexString = new StringBuffer();
        for (int _$I_Index = 0; _$I_Index < messageDigest.length; ++_$I_Index) {
            hexString.append(Integer.toHexString(255 & messageDigest[_$I_Index]));
        }
        String _$f_Foo_ = messageDigest.toString();
        _$s_String_ = "" + hexString;
        return _$s_String_;
    }

    private static JPanel b$u$l$L$_SH$i$T(final Component... com) {
        final JPanel f$uc_K$ = new JPanel();
        for (Component s : com) {
            f$uc_K$.add(s);
        }
        f$uc_K$.setLayout(new FlowLayout());
        return f$uc_K$;
    }

    private static int $$1(final int $$_23DeSh$T[], final int $Bul$) {
        return IntStream.range(0, $$_23DeSh$T.length)
                .filter($__Fkl -> $$_23DeSh$T[$__Fkl] == $Bul$)
                .findFirst()
                .getAsInt();
    }

    private static String fixME(final String key) {
        return key.replace("8.0", ADD);
    }
}