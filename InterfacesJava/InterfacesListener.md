# Interfaces listener y sus metodos
INTERFACE                     |     DESCRIPCION        |     METODO
------------------------------|------------------------|---------------------
ActionListener | La interfaz de escucha para recibir eventos de acción.| actionPerformed (ActionEvent)
AdjustmentListener | La interfaz de escucha para recibir eventos de ajuste. |adjustmentValueChanged (AdjustmentEvent)
ComponentListener | La interfaz de escucha para recibir eventos de componentes. |componentHidden(ComponentEvent) componentMoved (ComponentEvent) componentResized (ComponentEvent) componentShown (ComponentEvent) |
ContainerListener | La interfaz de escucha para recibir eventos de contenedores.| ComponentAdded (ComponentEvent) ComponentRemoved(ComponentEvent)
FocusListener | La interfaz de escucha para recibir eventos de teclado se centran en un componente. |   focusGained (FocusEvent)                          focusLost (FocusEvent)
ItemListener | La interfaz de escucha para recibir eventos de elemento. | itemStateChanged (ItemEvent)
KeyListener |  La interfaz de escucha para recibir eventos de teclado (combinaciones de teclas). | keyPressed (KeyEvent) keyReleased (KeyEvent) keyTyped (KeyEvent)
MouseListener | La interfaz de receptor para la recepción de "interesantes" eventos del ratón en un componente. | mouseClicked(MouseEvent) mouseEntered (MouseEvent) mouseExited (MouseEvent) mousePressed (MouseEvent) mouseReleased (MouseEvent)
MouseMotionListener | La interfaz de escucha para recibir eventos de ratón en movimiento en un componente. | mouseDragged (MouseEvent) mouseMoved (MouseEvent)
WindowListener | La interfaz de escucha para recibir eventos de ventana. | windowActivated (WindowEvent) windowClosed (WindowEvent) windowClosing (WindowEvent) windowDeactivated (WindowEvent) windowDeiconified (WindowEvent) windowIconified (WindowEvent) windowOpened (WindowEvent)








