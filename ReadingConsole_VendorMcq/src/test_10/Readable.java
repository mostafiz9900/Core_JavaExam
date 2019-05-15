/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_10;

/**
 *
 * @author Mostafizur
 */
public interface Readable {
    public void readBook();
    public void setBookMark();
}
abstract class Book implements Readable{

    @Override
    public abstract void readBook();

}
class Ebook extends Book{

    @Override
    public void readBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBookMark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
