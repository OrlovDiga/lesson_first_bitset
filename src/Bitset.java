
import java.util.*;

public class Bitset {
    private int quanity;
    private HashSet list;


    Bitset(int quanity) {
        this.quanity = quanity;
        this.list = new HashSet();
    }


    public HashSet intersection(Bitset secondSet) {
            for (Object i: this.list) {
                if (secondSet.getList().contains(i)) {
                    this.list.add(i);
                }

            }

            if (this.list.isEmpty()) {
                System.out.println("Заданные вами множества не имеют общих элементов.");
            } else {
                System.out.print("Общие элементы заданных множеств: ");
            }

            for (Object i: this.list) {
                System.out.print(i + " ");
            }
            return list;
    }


    public HashSet getList() {
        return list;
    }


    public HashSet union(Bitset secondSet) {
        if (secondSet.getList().size() <= this.quanity - this.list.size()) {
            this.list.addAll(secondSet.getList());
            System.out.println("Заданные множества успешно объединены.");
        } else {
            System.out.println("Множество " + secondSet + "не было добевлено в заданное множество," +
                    " так как его размер больше порога количества объектов во множестве." );
        }
        return this.list;
    }


    public HashSet add(Object val) {
            if (!this.list.contains(val) && this.quanity - this.list.size() > 0) {
                this.list.add(val);
                System.out.println("Элемент добавлен во множество.");
            } else {
                System.out.println("Такой элемент уже имеется в данном множестве или объем множества полностью заполнен.");
            }
            return this.list;
    }


    public HashSet addArrayList(Bitset tempArray) {
        if (this.quanity - this.list.size() >= tempArray.getList().size()) {
            for (Object i: tempArray.list) {
                list.add(i);
            }
            System.out.println("Элементы заданного массива были успешно добавлены во множество.");
        } else {
            System.out.println("Элементы не были добавлены, так как недостаточно места во множестве.");
        }
        return this.list;
    }


    public HashSet addArrayList(ArrayList tempArray) {
        if (this.quanity - this.list.size() >= tempArray.size()) {
            for (int i = 0; i < tempArray.size(); i++) {
                this.list.add(tempArray.get(i));
            }
            System.out.println("Элементы заданного массива были успешно добавлены во множество.");
        } else {
            System.out.println("Элементы не были добавлены, так как недостаточно места во множестве.");
        }
        return this.list;
    }


    public HashSet delete(Object val) {
        if (this.list.contains(val)) {
            this.list.remove(val);
            System.out.println("Элемент успешно удален из заданного множества.");
        } else {
            System.out.println("Такого элемента не найдено в заданном множестве.");
        }
        return this.list;
    }


    public HashSet deleteSet(Bitset values) {
            this.list.removeAll(values.getList());
            System.out.println("Элементы успешно удалены из заданного множества.");
            return this.list;
    }


    public HashSet deleteSet(HashSet values) {
        this.list.removeAll(values);
        System.out.println("Элементы успешно удалены из заданного множества.");
        return this.list;
    }


    public boolean own(Object num) {
        System.out.println("Принадлежность элемента множеству:" + this.list.contains(num));
        return list.contains(num);
    }


    public void iterSet() {
        this.list.forEach(System.out::println);
    }
}
