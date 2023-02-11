package Mod14_Collections;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

/*1) Создаем Node node, записываем туда value.
  2) Смотрим, какой элемент был до этого последним
  (на него ссылается last.prev).
  Его записываем в node.prev.
  И наоборот: в next этого элемента пишем node.
  Если last.prev==null (то есть до этого список был пустой),
  то эти манипуляции проделываем с first.
  3) В last.prev пишем ссылку на node,
  и наоборот: в node.next пишем ссылку на last.
 */
    public void add(String value) {
        Node element = new Node();
        element.value = value;

        if (first.next == null) {
            first.next = element;
        }
        else {
            last.prev.next = element;
            element.prev = last.prev;
        }
        last.prev = element;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}