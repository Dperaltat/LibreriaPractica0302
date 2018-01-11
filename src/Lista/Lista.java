package Lista;

import java.util.ArrayList;
import java.util.List;

public class Lista<E> {

    private List<E> elementoList;

    public Lista(List<E> elementoList) {
        this.elementoList = elementoList;
    }

    public List<E> getElementoList() {
        return elementoList;
    }

    public void setElementoList(List<E> elementoList) {
        this.elementoList = elementoList;
    }
    
    public boolean agregarElemento(E valor) {
        return this.elementoList.add(valor);
    }
    
    public E recuperarElemento(int id) {
        return this.elementoList.get(id);
    }
    
    public boolean eliminarElemento(int id) {
        return this.elementoList.remove(this.getElementoList().get(id));
    }

    @Override
    public String toString() {
        return "Lista{" + "elementoList=" + elementoList + '}';
    }
    
}
