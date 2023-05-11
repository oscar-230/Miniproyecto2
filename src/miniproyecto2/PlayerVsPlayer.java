
package miniproyecto2;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class PlayerVsPlayer extends javax.swing.JFrame {

    int turno=0;
    int puntosGanador = 0;
    int X = 0;
    int O = 0;
    
    String XObutton00 ;
    String XObutton01 ;
    String XObutton02 ;
    String XObutton10 ;
    String XObutton11 ;
    String XObutton12 ;
    String XObutton20 ;
    String XObutton21 ;
    String XObutton22 ;

    /**
     * Creates new form Prueba
     */
    public PlayerVsPlayer() {
        initComponents();
        
    }
    
    public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource(); // obtiene el botón que desencadenó el evento
    if (button.getText().equals("")) { // comprueba que el botón no tenga ya una "X" o "O"
        if (turno == 0) {
            button.setText("X"); // establece el texto del botón como "X" si es el turno del jugador 1
            turno = 1; // cambia el turno al jugador 2
        } else {
            button.setText("O"); // establece el texto del botón como "O" si es el turno del jugador 2
            turno = 0; // cambia el turno al jugador 1
        }
    }
    }
    
    public void Resetear() {
        
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    
    }
    
    
    
     /*public void puntos(){
        MenuDeJuego newframe = new MenuDeJuego();
        int valorpuntosParaGanar = newframe.getpuntosParaGanar();
        System.out.println("Valor de variableA en ClaseA: " + valorpuntosParaGanar);
        
    }*/
    
    public void extraerContenido(){
        
        XObutton00 = b1.getText();
        XObutton01 = b2.getText();
        XObutton02 = b3.getText();
        XObutton10 = b4.getText();
        XObutton11 = b5.getText();
        XObutton12 = b6.getText();
        XObutton20 = b7.getText();
        XObutton21 = b8.getText();
        XObutton22 = b9.getText();
    }
    
    
    public void extraerNombres(){
        String nombre = campojugadoruno.getText();
        String nombre2 = campojugadordos.getText();
        Estadisticas.FinalJugador1.setText(nombre);
        Estadisticas.FinalJugador2.setText(nombre2);
    }
    
    public void puntosGanador(){
        puntosGanador = Integer.parseInt(puntosParaGanar.getText());
    }
    
    public void puntajes(){
        PuntajeJ1.setText(""+X);
        PuntajeJ2.setText(""+O);
        
    }
    
    public void quienGano(){
        if(X>O){
            String nombre = campojugadoruno.getText();
            Estadisticas.Ganador.setText(nombre);
        }
        else{
            String nombre = campojugadordos.getText();
            Estadisticas.Ganador.setText(nombre);
        }
        
    }
    
    public void seTermino(){
   
            Estadisticas newframe = new Estadisticas();
            newframe.setVisible(true);
            this.dispose();//para que no se acumulen las ventanas
            Estadisticas.PuntajeJ1.setText(""+X);
            Estadisticas.PuntajeJ2.setText(""+O);
            extraerNombres();
            quienGano();
             
    }
    
    
    
    public void ganador(){
        extraerContenido();
        puntosGanador();
        
        
          
        ///Para La X
        if (XObutton00 != "" && XObutton00 == XObutton01 && XObutton01==XObutton02 && XObutton00 == "X" ){
            X = X+1;
            if (X==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton10 != "" && XObutton10 == XObutton11 && XObutton11==XObutton12 && XObutton10 == "X"){
            X = X+1;
            if (X==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton20 != "" && XObutton20 == XObutton21 && XObutton21==XObutton22 && XObutton20 == "X" ){
            X = X+1;
            if (X==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton00 != "" && XObutton00 == XObutton10 && XObutton10==XObutton20 && XObutton00 == "X" ){
            X = X+1;
            if (X==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton01 != "" && XObutton01 == XObutton11 && XObutton11==XObutton21 && XObutton01 == "X" ){
            X = X+1;
            if (X==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton02 != "" && XObutton02 == XObutton12 && XObutton12==XObutton22 && XObutton02 == "X" ){
            X = X+1;
            if (X==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton00 != "" && XObutton00 == XObutton11 && XObutton11==XObutton22 && XObutton00 == "X" ){
            X = X+1;
            if (X==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton02 != "" && XObutton02 == XObutton11 && XObutton11==XObutton20 && XObutton02 == "X" ){
            X = X+1;
            if (X==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        
        ///Para La O
        
        if (XObutton00 != "" && XObutton00 == XObutton01 && XObutton01==XObutton02 && XObutton00 == "O" ){
            O = O+1;
            if (O==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton10 != "" && XObutton10 == XObutton11 && XObutton11==XObutton12 && XObutton10 == "O"){
            O = O+1;
            if (O==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton20 != "" && XObutton20 == XObutton21 && XObutton21==XObutton22 && XObutton20 == "O" ){
            O = O+1;
            if (O==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton00 != "" && XObutton00 == XObutton10 && XObutton10==XObutton20 && XObutton00 == "O" ){
            O = O+1;
            if (O==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton01 != "" && XObutton01 == XObutton11 && XObutton11==XObutton21 && XObutton01 == "O" ){
            O = O+1;
            if (O==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton02 != "" && XObutton02 == XObutton12 && XObutton12==XObutton22 && XObutton02 == "O" ){
            O = O+1;
            if (O==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton00 != "" && XObutton00 == XObutton11 && XObutton11==XObutton22 && XObutton00 == "O" ){
            O = O+1;
            if (O==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if (XObutton02 != "" && XObutton02 == XObutton11 && XObutton11==XObutton20 && XObutton02 == "O" ){
            O = O+1;
            if (O==puntosGanador){
                seTermino();
            }else{
            Resetear();
            }
        }
        if(XObutton00 != ""&&XObutton01 != ""&&XObutton02 != ""&&XObutton10 != ""&&XObutton11 != ""&&XObutton12 != ""&&XObutton20 != ""&&XObutton21 != ""&&XObutton22 != ""){
            JOptionPane.showMessageDialog(null, "EMPATE ", "TIC TAC TOE", JOptionPane.PLAIN_MESSAGE);
            Resetear();
        }
       
    }

   
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        PuntajeJ1 = new javax.swing.JTextField();
        puntosParaGanar = new javax.swing.JTextField();
        campojugadordos = new javax.swing.JTextField();
        campojugadoruno = new javax.swing.JTextField();
        PuntajeJ2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(77, 207, 192));
        setLocation(500, 200);

        b1.setBackground(new java.awt.Color(204, 255, 204));
        b1.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 51, 0));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b1KeyPressed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 255, 204));
        b2.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 51, 0));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b2KeyPressed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(204, 255, 204));
        b3.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 51, 0));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        b3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b3KeyPressed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(204, 255, 204));
        b4.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 51, 0));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b4KeyPressed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(204, 255, 204));
        b5.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b5.setForeground(new java.awt.Color(0, 51, 0));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        b5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b5KeyPressed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(204, 255, 204));
        b6.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b6.setForeground(new java.awt.Color(0, 51, 0));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        b6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b6KeyPressed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(204, 255, 204));
        b7.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b7.setForeground(new java.awt.Color(0, 51, 0));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        b7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b7KeyPressed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(204, 255, 204));
        b8.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b8.setForeground(new java.awt.Color(0, 51, 0));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        b8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b8KeyPressed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(204, 255, 204));
        b9.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        b9.setForeground(new java.awt.Color(0, 51, 0));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        b9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b9KeyPressed(evt);
            }
        });

        PuntajeJ1.setEditable(false);
        PuntajeJ1.setBackground(new java.awt.Color(77, 207, 192));
        PuntajeJ1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        PuntajeJ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PuntajeJ1.setText("0");
        PuntajeJ1.setBorder(null);
        PuntajeJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntajeJ1ActionPerformed(evt);
            }
        });

        puntosParaGanar.setEditable(false);
        puntosParaGanar.setBackground(new java.awt.Color(77, 207, 192));
        puntosParaGanar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        puntosParaGanar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        puntosParaGanar.setText("0");
        puntosParaGanar.setBorder(null);
        puntosParaGanar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntosParaGanarActionPerformed(evt);
            }
        });

        campojugadordos.setEditable(false);
        campojugadordos.setBackground(new java.awt.Color(77, 207, 192));
        campojugadordos.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        campojugadordos.setForeground(new java.awt.Color(0, 51, 0));
        campojugadordos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campojugadordos.setBorder(null);
        campojugadordos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campojugadordosActionPerformed(evt);
            }
        });

        campojugadoruno.setEditable(false);
        campojugadoruno.setBackground(new java.awt.Color(77, 207, 192));
        campojugadoruno.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        campojugadoruno.setForeground(new java.awt.Color(0, 51, 0));
        campojugadoruno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campojugadoruno.setBorder(null);
        campojugadoruno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campojugadorunoActionPerformed(evt);
            }
        });

        PuntajeJ2.setEditable(false);
        PuntajeJ2.setBackground(new java.awt.Color(77, 207, 192));
        PuntajeJ2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        PuntajeJ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PuntajeJ2.setText("0");
        PuntajeJ2.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setText("Puntos Para Ganar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campojugadoruno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(campojugadordos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(PuntajeJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(PuntajeJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntosParaGanar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campojugadoruno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campojugadordos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(PuntajeJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(PuntajeJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntosParaGanar)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
       
    }//GEN-LAST:event_b1ActionPerformed

    private void b1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b1.doClick();
        }
    }//GEN-LAST:event_b1KeyPressed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       actionPerformed(evt);
       ganador();
       puntajes();
    }//GEN-LAST:event_b2ActionPerformed

    private void b2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b2.doClick();
        }
    }//GEN-LAST:event_b2KeyPressed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_b3ActionPerformed

    private void b3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b3KeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b3.doClick();
        }
    }//GEN-LAST:event_b3KeyPressed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
       actionPerformed(evt);
       ganador();
       puntajes();
    }//GEN-LAST:event_b7ActionPerformed

    private void b7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b7.doClick();   
        }
    }//GEN-LAST:event_b7KeyPressed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_b8ActionPerformed

    private void b8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b8.doClick();
        }
    }//GEN-LAST:event_b8KeyPressed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_b9ActionPerformed

    private void b9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b9.doClick();
        }
    }//GEN-LAST:event_b9KeyPressed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_b4ActionPerformed

    private void b4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b4.doClick();
        }
    }//GEN-LAST:event_b4KeyPressed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       actionPerformed(evt);
       ganador();
       puntajes();
    }//GEN-LAST:event_b5ActionPerformed

    private void b5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b7.doClick();
        }
    }//GEN-LAST:event_b5KeyPressed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_b6ActionPerformed

    private void b6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            b6.doClick();
        }
    }//GEN-LAST:event_b6KeyPressed

    private void campojugadorunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campojugadorunoActionPerformed
        // Para que el nombre aparezaca en la ventana
        String nombre = campojugadoruno.getText();
        campojugadoruno.setText(campojugadoruno.getText()+nombre);
        this.dispose();
    }//GEN-LAST:event_campojugadorunoActionPerformed

    private void campojugadordosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campojugadordosActionPerformed
        // TODO add your handling code here:
        String nombre2 = campojugadordos.getText();
        campojugadordos.setText(campojugadordos.getText()+nombre2);
        this.dispose();
    }//GEN-LAST:event_campojugadordosActionPerformed

    private void PuntajeJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntajeJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuntajeJ1ActionPerformed

    private void puntosParaGanarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntosParaGanarActionPerformed
        String nombre = puntosParaGanar.getText();
        puntosParaGanar.setText(puntosParaGanar.getText()+nombre);
        this.dispose();
    }//GEN-LAST:event_puntosParaGanarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerVsPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerVsPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerVsPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerVsPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerVsPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField PuntajeJ1;
    public static javax.swing.JTextField PuntajeJ2;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    public static javax.swing.JTextField campojugadordos;
    public static javax.swing.JTextField campojugadoruno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField puntosParaGanar;
    // End of variables declaration//GEN-END:variables
}
