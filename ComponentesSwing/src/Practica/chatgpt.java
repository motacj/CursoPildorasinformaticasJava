package Practica;

import java.awt.BorderLayout;
import java.awt.HeadlessException;


import javax.swing.*;
import javax.swing.text.*;

public class chatgpt {
	public static void main(String[] args) {
        MarcoCuadroTex mimarco = new MarcoCuadroTex();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCuadroTex extends JFrame {

    public MarcoCuadroTex() throws HeadlessException {
        super();
        setBounds(600, 300, 600, 400);
        add(new LaminaCuadroEven());
        setVisible(true);
    }
}

class LaminaCuadroEven extends JPanel {

    private JTextPane areaTexto;
    private StyledDocument doc;
    private SimpleAttributeSet attrs;

    public LaminaCuadroEven() {
        super();

        JMenuBar miBarra = new JMenuBar();

        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamanho = new JMenu("Tamaño");

        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamanho);

        // ---------- TEXT AREA ----------
        areaTexto = new JTextPane();
        areaTexto.setEditorKit(new StyledEditorKit());
        doc = (StyledDocument) areaTexto.getDocument();
        attrs = new SimpleAttributeSet();

        // ---------- FUENTES ----------
        JMenuItem arial = new JMenuItem("Arial");
        arial.addActionListener(e -> aplicarFuente("Arial"));
        fuente.add(arial);

        JMenuItem verdana = new JMenuItem("Verdana");
        verdana.addActionListener(e -> aplicarFuente("Verdana"));
        fuente.add(verdana);

        JMenuItem tahoma = new JMenuItem("Tahoma");
        tahoma.addActionListener(e -> aplicarFuente("Tahoma"));
        fuente.add(tahoma);

        // ---------- ESTILOS ----------
        JMenuItem negrita = new JMenuItem("Negrita");
        negrita.addActionListener(e -> aplicarNegrita());
        estilo.add(negrita);

        JMenuItem cursiva = new JMenuItem("Cursiva");
        cursiva.addActionListener(e -> aplicarCursiva());
        estilo.add(cursiva);

        JMenuItem subrayado = new JMenuItem("Subrayado");
        subrayado.addActionListener(e -> aplicarSubrayado());
        estilo.add(subrayado);

        // ---------- TAMAÑOS ----------
        JMenuItem diez = new JMenuItem("10");
        diez.addActionListener(e -> aplicarTamaño(10));
        tamanho.add(diez);

        JMenuItem doce = new JMenuItem("12");
        doce.addActionListener(e -> aplicarTamaño(12));
        tamanho.add(doce);

        JMenuItem catorce = new JMenuItem("14");
        catorce.addActionListener(e -> aplicarTamaño(14));
        tamanho.add(catorce);

        setLayout(new BorderLayout());
        add(miBarra, BorderLayout.NORTH);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
    }

    private void aplicarFuente(String fuente) {
        int start = areaTexto.getSelectionStart();
        int end = areaTexto.getSelectionEnd();
        StyleConstants.setFontFamily(attrs, fuente);
        doc.setCharacterAttributes(start, end - start, attrs, false);
    }

    private void aplicarNegrita() {
        int start = areaTexto.getSelectionStart();
        int end = areaTexto.getSelectionEnd();
        StyleConstants.setBold(attrs, true);
        doc.setCharacterAttributes(start, end - start, attrs, false);
    }

    private void aplicarCursiva() {
        int start = areaTexto.getSelectionStart();
        int end = areaTexto.getSelectionEnd();
        StyleConstants.setItalic(attrs, true);
        doc.setCharacterAttributes(start, end - start, attrs, false);
    }

    private void aplicarSubrayado() {
        int start = areaTexto.getSelectionStart();
        int end = areaTexto.getSelectionEnd();
        StyleConstants.setUnderline(attrs, true);
        doc.setCharacterAttributes(start, end - start, attrs, false);
    }

    private void aplicarTamaño(int tamaño) {
        int start = areaTexto.getSelectionStart();
        int end = areaTexto.getSelectionEnd();
        StyleConstants.setFontSize(attrs, tamaño);
        doc.setCharacterAttributes(start, end - start, attrs, false);
    }
}