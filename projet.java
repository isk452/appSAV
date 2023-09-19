import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class projet {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Formulaire");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300); // Ajustez la taille du formulaire
            frame.setMinimumSize(new Dimension(400, 300)); // Définissez une taille minimale

            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout()); // Utilisez GridBagLayout pour une mise en page flexible

            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.HORIZONTAL; // Remplissage horizontal
            constraints.insets = new Insets(5, 10, 5, 10); // Espacement autour des composants

            // Utilisez une police plus petite pour les libellés
            Font labelFont = new Font("SansSerif", Font.PLAIN, 14);

            JLabel labelNom = new JLabel("Nom : ");
            labelNom.setFont(labelFont);
            JTextField champNom = new JTextField();
            champNom.setFont(labelFont);

            JLabel labelPrenom = new JLabel("Prénom : ");
            labelPrenom.setFont(labelFont);
            JTextField champPrenom = new JTextField();
            champPrenom.setFont(labelFont);

            JLabel labelTelephone = new JLabel("Téléphone : ");
            labelTelephone.setFont(labelFont);
            JTextField champTelephone = new JTextField();
            champTelephone.setFont(labelFont);

            JLabel labelEmail = new JLabel("E-mail : ");
            labelEmail.setFont(labelFont);
            JTextField champEmail = new JTextField();
            champEmail.setFont(labelFont);

            JLabel labelMessage = new JLabel("Message : ");
            labelMessage.setFont(labelFont);
            JTextArea champMessage = new JTextArea(5, 20);
            champMessage.setLineWrap(true);
            champMessage.setWrapStyleWord(true);

            JButton boutonCreeTicket = new JButton("Créer ticket");
            JTextArea ticketTextArea = new JTextArea(5, 20);
            ticketTextArea.setEditable(false);

            boutonCreeTicket.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nom = champNom.getText();
                    String prenom = champPrenom.getText();
                    String telephone = champTelephone.getText();
                    String email = champEmail.getText();
                    String message = champMessage.getText();

                    String ticket = "Nom : " + nom + "\nPrénom : " + prenom + "\nTéléphone : " + telephone + "\nE-mail : " + email + "\nMessage : " + message;
                    ticketTextArea.setText(ticket);
                }
            });

            // Ajoutez les composants avec des contraintes
            constraints.gridx = 0;
            constraints.gridy = 0;
            panel.add(labelNom, constraints);

            constraints.gridx = 1;
            constraints.gridy = 0;
            panel.add(champNom, constraints);

            constraints.gridx = 0;
            constraints.gridy = 1;
            panel.add(labelPrenom, constraints);

            constraints.gridx = 1;
            constraints.gridy = 1;
            panel.add(champPrenom, constraints);

            constraints.gridx = 0;
            constraints.gridy = 2;
            panel.add(labelTelephone, constraints);

            constraints.gridx = 1;
            constraints.gridy = 2;
            panel.add(champTelephone, constraints);

            constraints.gridx = 0;
            constraints.gridy = 3;
            panel.add(labelEmail, constraints);

            constraints.gridx = 1;
            constraints.gridy = 3;
            panel.add(champEmail, constraints);

            constraints.gridx = 0;
            constraints.gridy = 4;
            panel.add(labelMessage, constraints);

            constraints.gridx = 1;
            constraints.gridy = 4;
            constraints.gridwidth = 2; // Étendre sur deux colonnes pour la zone de texte du message

            // Ajoutez la zone de texte du message et le bouton
            panel.add(champMessage, constraints);

            constraints.gridx = 0;
            constraints.gridy = 5;
            constraints.gridwidth = 2; // Réinitialisez la largeur de la grille pour le bouton
            panel.add(boutonCreeTicket, constraints);

            frame.add(panel);
            frame.add(new JScrollPane(ticketTextArea), BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
