/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace;

/**
 *
 * @author User
 */
public class TestReplaceIndex {
    
    public static void main(String[] args) {
        
        System.out.println(ReplaceIndex.replaceCharFromIndex("OCA Java course for ultimate nutters",
                'r', 'R', 10));
        System.out.println(ReplaceIndex.replaceCharFromIndex("OCA Java course for ultimate nutters",
                'r', 'R', 15));
        System.out.println(ReplaceIndex.replaceCharFromIndex("OCA Java course for ultimate nutters",
                'r', 'R', 20));
    }
    
}
