package vista.ventana;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Pelicula;
import servicio.SistemaVideoClub;

public class VentanaPelicula extends javax.swing.JPanel {

    private SistemaVideoClub sistema;

    public VentanaPelicula() {
        initComponents();
    }

    public VentanaPelicula(SistemaVideoClub sistema) {
        initComponents();
        this.sistema = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnQuitarPeliculaActionPerformed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarCatalogoActionPerformed = new javax.swing.JButton();
        btnAgregarPeliculaActionPerformed = new javax.swing.JButton();
        btnBuscarPelicula = new javax.swing.JButton();
        btnModificarPelicula = new javax.swing.JButton();

        btnQuitarPeliculaActionPerformed.setText("Quitar");
        btnQuitarPeliculaActionPerformed.addActionListener(this::btnQuitarPeliculaActionPerformedActionPerformed);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pelicula");
        jLabel1.setToolTipText("");

        btnMostrarCatalogoActionPerformed.setText("Mostrar catalogo");
        btnMostrarCatalogoActionPerformed.addActionListener(this::btnMostrarCatalogoActionPerformedActionPerformed);

        btnAgregarPeliculaActionPerformed.setText("Agregar");
        btnAgregarPeliculaActionPerformed.addActionListener(this::btnAgregarPeliculaActionPerformedActionPerformed);

        btnBuscarPelicula.setText("Buscar");
        btnBuscarPelicula.addActionListener(this::btnBuscarPeliculaActionPerformed);

        btnModificarPelicula.setText("Modificar");
        btnModificarPelicula.addActionListener(this::btnModificarPeliculaActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarPeliculaActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuitarPeliculaActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMostrarCatalogoActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPeliculaActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitarPeliculaActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMostrarCatalogoActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPeliculaActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPeliculaActionPerformedActionPerformed
        JTextField tituloField = new JTextField(20);
        JTextField autorField = new JTextField(20);
        JTextField generoField = new JTextField(20);
        JTextField anioField = new JTextField(20);
        JTextField idField = new JTextField(20);
        JTextField copiasField = new JTextField(20);
        JCheckBox mayor18Check = new JCheckBox("Restriccion de edad (+18)");

        JPanel formulario = new JPanel(new GridLayout(0, 2, 8, 8));
        formulario.add(new JLabel("Titulo:"));
        formulario.add(tituloField);
        formulario.add(new JLabel("Autor:"));
        formulario.add(autorField);
        formulario.add(new JLabel("Genero:"));
        formulario.add(generoField);
        formulario.add(new JLabel("Anio de publicacion:"));
        formulario.add(anioField);
        formulario.add(new JLabel("ID de la pelicula:"));
        formulario.add(idField);
        formulario.add(new JLabel("Copias en stock:"));
        formulario.add(copiasField);
        formulario.add(new JLabel(""));
        formulario.add(mayor18Check);

        int opcion = JOptionPane.showConfirmDialog(
                this,
                formulario,
                "Agregar Pelicula",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (opcion != JOptionPane.OK_OPTION) {
            return;
        }

        String titulo = tituloField.getText();
        String autor = autorField.getText();
        String genero = generoField.getText();
        String inputAnio = anioField.getText();
        String inputId = idField.getText();
        String inputCopias = copiasField.getText();

        if (titulo.trim().isEmpty() || autor.trim().isEmpty() || genero.trim().isEmpty()
                || inputAnio.trim().isEmpty() || inputId.trim().isEmpty() || inputCopias.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int estrenoYear = Integer.parseInt(inputAnio.trim());
            int idPelicula = Integer.parseInt(inputId.trim());
            int copiasDisponibles = Integer.parseInt(inputCopias.trim());

            if (sistema.busquedaBinariaPeliculas(idPelicula) != null) {
                JOptionPane.showMessageDialog(this, "Ya existe una pelicula con ese ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Pelicula nueva = new Pelicula(titulo.trim(), autor.trim(), genero.trim(), estrenoYear, idPelicula, copiasDisponibles, mayor18Check.isSelected());
            sistema.agregarOrdenado(nueva);
            JOptionPane.showMessageDialog(this, "Pelicula agregada con exito.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Anio, ID y copias deben ser numeros enteros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarPeliculaActionPerformedActionPerformed

    private void btnQuitarPeliculaActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarPeliculaActionPerformedActionPerformed
        String inputId = JOptionPane.showInputDialog(this, "Ingrese ID de la pelicula a eliminar:", "Quitar Pelicula", JOptionPane.WARNING_MESSAGE);
        if (inputId == null || inputId.trim().isEmpty()) {
            return;
        }
        try {
            int id = Integer.parseInt(inputId.trim());
            String resultado = sistema.eliminarPelicula(id);
            JOptionPane.showMessageDialog(this, resultado, "Quitar Pelicula", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un numero entero valido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnQuitarPeliculaActionPerformedActionPerformed

    private void btnMostrarCatalogoActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCatalogoActionPerformedActionPerformed
        String catalogo = sistema.mostrarCatalogoPeliculas();
        if (catalogo == null || catalogo.trim().isEmpty() || sistema.listarPeliculas().isEmpty()) {
            catalogo = "No hay peliculas para mostrar";
        }

        JTextArea textArea = new JTextArea(15, 30);
        textArea.setText(catalogo);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(this, scrollPane, "Catalogo de Peliculas", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnMostrarCatalogoActionPerformedActionPerformed

    private void btnBuscarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {
        String inputId = JOptionPane.showInputDialog(this, "Ingrese el ID de la pelicula:", "Buscar Pelicula", JOptionPane.QUESTION_MESSAGE);
        if (inputId == null || inputId.trim().isEmpty()) {
            return;
        }
        try {
            int id = Integer.parseInt(inputId.trim());
            Pelicula pelicula = sistema.busquedaBinariaPeliculas(id);
            if (pelicula == null) {
                JOptionPane.showMessageDialog(this, "No se encontro la pelicula.", "Buscar Pelicula", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String datos = "ID: " + pelicula.getIdPelicula()
                    + "\nTitulo: " + pelicula.getTitulo()
                    + "\nAutor: " + pelicula.getAutor()
                    + "\nGenero: " + pelicula.getGenero()
                    + "\nAnio: " + pelicula.getEstrenoYear()
                    + "\nCopias disponibles: " + pelicula.getCopiasDisponibles()
                    + "\nRestriccion +18: " + (pelicula.isMayor18() ? "Si" : "No");
            JOptionPane.showMessageDialog(this, datos, "Pelicula encontrada", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un numero entero valido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnModificarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {
        String inputId = JOptionPane.showInputDialog(this, "Ingrese el ID de la pelicula a modificar:", "Modificar Pelicula", JOptionPane.QUESTION_MESSAGE);
        if (inputId == null || inputId.trim().isEmpty()) {
            return;
        }

        Pelicula pelicula;
        try {
            int id = Integer.parseInt(inputId.trim());
            pelicula = sistema.busquedaBinariaPeliculas(id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un numero entero valido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (pelicula == null) {
            JOptionPane.showMessageDialog(this, "No se encontro la pelicula.", "Modificar Pelicula", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        JTextField tituloField = new JTextField(pelicula.getTitulo(), 20);
        JTextField autorField = new JTextField(pelicula.getAutor(), 20);
        JTextField generoField = new JTextField(pelicula.getGenero(), 20);
        JTextField anioField = new JTextField(String.valueOf(pelicula.getEstrenoYear()), 20);
        JTextField copiasField = new JTextField(String.valueOf(pelicula.getCopiasDisponibles()), 20);
        JCheckBox mayor18Check = new JCheckBox("Restriccion de edad (+18)", pelicula.isMayor18());

        JPanel formulario = new JPanel(new GridLayout(0, 2, 8, 8));
        formulario.add(new JLabel("Titulo:"));
        formulario.add(tituloField);
        formulario.add(new JLabel("Autor:"));
        formulario.add(autorField);
        formulario.add(new JLabel("Genero:"));
        formulario.add(generoField);
        formulario.add(new JLabel("Anio de publicacion:"));
        formulario.add(anioField);
        formulario.add(new JLabel("Copias disponibles:"));
        formulario.add(copiasField);
        formulario.add(new JLabel(""));
        formulario.add(mayor18Check);

        int opcion = JOptionPane.showConfirmDialog(this, formulario, "Modificar Pelicula", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (opcion != JOptionPane.OK_OPTION) {
            return;
        }

        try {
            if (!anioField.getText().trim().isEmpty()) {
                Integer.parseInt(anioField.getText().trim());
            }
            if (!copiasField.getText().trim().isEmpty()) {
                Integer.parseInt(copiasField.getText().trim());
            }
            String resultado = sistema.modificarPelicula(
                    pelicula.getIdPelicula(),
                    tituloField.getText(),
                    autorField.getText(),
                    generoField.getText(),
                    anioField.getText(),
                    copiasField.getText(),
                    mayor18Check.isSelected());
            JOptionPane.showMessageDialog(this, resultado, "Modificar Pelicula", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Anio y copias deben ser numeros enteros validos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPeliculaActionPerformed;
    private javax.swing.JButton btnBuscarPelicula;
    private javax.swing.JButton btnMostrarCatalogoActionPerformed;
    private javax.swing.JButton btnModificarPelicula;
    private javax.swing.JButton btnQuitarPeliculaActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
