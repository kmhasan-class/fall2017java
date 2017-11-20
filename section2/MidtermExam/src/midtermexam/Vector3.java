/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;

/**
 *
 * @author kmhasan
 */
public class Vector3 {
    private int i;
    private int j;
    private int k;

    public Vector3(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public Vector3() {
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }

    @Override
    public String toString() {
        return i + "i + " + j + "j + " + k + "k";
    }

    public double getMagnitude() {
        return Math.sqrt(i * i + j * j + k * k);
    }
    
    public int dotProduct(Vector3 v) {
        Vector3 u = this;
        return u.i * v.i + u.j * v.j + u.k * v.k;
    }
}
