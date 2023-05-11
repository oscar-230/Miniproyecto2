
package miniproyecto2;

import java.awt.event.ActionEvent;
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
        
        button00.setText("");
        button01.setText("");
        button02.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button20.setText("");
        button21.setText("");
        button22.setText("");
    
    }
    
    
    
     /*public void puntos(){
        MenuDeJuego newframe = new MenuDeJuego();
        int valorpuntosParaGanar = newframe.getpuntosParaGanar();
        System.out.println("Valor de variableA en ClaseA: " + valorpuntosParaGanar);
        
    }*/
    
    public void extraerContenido(){
        
        XObutton00 = button00.getText();
        XObutton01 = button01.getText();
        XObutton02 = button02.getText();
        XObutton10 = button10.getText();
        XObutton11 = button11.getText();
        XObutton12 = button12.getText();
        XObutton20 = button20.getText();
        XObutton21 = button21.getText();
        XObutton22 = button22.getText();
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
        button00 = new javax.swing.JButton();
        button01 = new javax.swing.JButton();
        button02 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button20 = new javax.swing.JButton();
        button21 = new javax.swing.JButton();
        button22 = new javax.swing.JButton();
        PuntajeJ1 = new javax.swing.JTextField();
        puntosParaGanar = new javax.swing.JTextField();
        campojugadordos = new javax.swing.JTextField();
        campojugadoruno = new javax.swing.JTextField();
        PuntajeJ2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(77, 207, 192));
        setLocation(500, 200);

        button00.setBackground(new java.awt.Color(204, 255, 204));
        button00.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button00.setForeground(new java.awt.Color(0, 51, 0));
        button00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button00ActionPerformed(evt);
            }
        });
        button00.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button00KeyPressed(evt);
            }
        });

        button01.setBackground(new java.awt.Color(204, 255, 204));
        button01.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button01.setForeground(new java.awt.Color(0, 51, 0));
        button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button01ActionPerformed(evt);
            }
        });
        button01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button01KeyPressed(evt);
            }
        });

        button02.setBackground(new java.awt.Color(204, 255, 204));
        button02.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button02.setForeground(new java.awt.Color(0, 51, 0));
        button02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button02ActionPerformed(evt);
            }
        });
        button02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button02KeyPressed(evt);
            }
        });

        button10.setBackground(new java.awt.Color(204, 255, 204));
        button10.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button10.setForeground(new java.awt.Color(0, 51, 0));
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        button10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button10KeyPressed(evt);
            }
        });

        button11.setBackground(new java.awt.Color(204, 255, 204));
        button11.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button11.setForeground(new java.awt.Color(0, 51, 0));
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });
        button11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button11KeyPressed(evt);
            }
        });

        button12.setBackground(new java.awt.Color(204, 255, 204));
        button12.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button12.setForeground(new java.awt.Color(0, 51, 0));
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        button12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button12KeyPressed(evt);
            }
        });

        button20.setBackground(new java.awt.Color(204, 255, 204));
        button20.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button20.setForeground(new java.awt.Color(0, 51, 0));
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });
        button20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button20KeyPressed(evt);
            }
        });

        button21.setBackground(new java.awt.Color(204, 255, 204));
        button21.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button21.setForeground(new java.awt.Color(0, 51, 0));
        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });
        button21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button21KeyPressed(evt);
            }
        });

        button22.setBackground(new java.awt.Color(204, 255, 204));
        button22.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        button22.setForeground(new java.awt.Color(0, 51, 0));
        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });
        button22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button22KeyPressed(evt);
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
                    .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button12, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(button10, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void button00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button00ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
       
    }//GEN-LAST:event_button00ActionPerformed

    private void button00KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button00KeyPressed
        
    }//GEN-LAST:event_button00KeyPressed

    private void button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button01ActionPerformed
       actionPerformed(evt);
       ganador();
       puntajes();
    }//GEN-LAST:event_button01ActionPerformed

    private void button01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button01KeyPressed
        
    }//GEN-LAST:event_button01KeyPressed

    private void button02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button02ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_button02ActionPerformed

    private void button02KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button02KeyPressed
      
    }//GEN-LAST:event_button02KeyPressed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
       actionPerformed(evt);
       ganador();
       puntajes();
    }//GEN-LAST:event_button20ActionPerformed

    private void button20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button20KeyPressed
        
    }//GEN-LAST:event_button20KeyPressed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_button21ActionPerformed

    private void button21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button21KeyPressed
        
    }//GEN-LAST:event_button21KeyPressed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_button22ActionPerformed

    private void button22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button22KeyPressed
        
    }//GEN-LAST:event_button22KeyPressed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_button10ActionPerformed

    private void button10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button10KeyPressed
        
    }//GEN-LAST:event_button10KeyPressed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
       actionPerformed(evt);
       ganador();
       puntajes();
    }//GEN-LAST:event_button11ActionPerformed

    private void button11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button11KeyPressed
        
    }//GEN-LAST:event_button11KeyPressed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        actionPerformed(evt);
        ganador();
        puntajes();
    }//GEN-LAST:event_button12ActionPerformed

    private void button12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button12KeyPressed
        
    }//GEN-LAST:event_button12KeyPressed

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
    private javax.swing.JButton button00;
    private javax.swing.JButton button01;
    private javax.swing.JButton button02;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button20;
    private javax.swing.JButton button21;
    private javax.swing.JButton button22;
    public static javax.swing.JTextField campojugadordos;
    public static javax.swing.JTextField campojugadoruno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField puntosParaGanar;
    // End of variables declaration//GEN-END:variables
}
