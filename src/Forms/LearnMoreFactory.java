/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

public class LearnMoreFactory implements FormFactoryInterface {
    @Override
    public javax.swing.JFrame createForm(int userID) {
        return new LearnMore(userID);
    }
}
