package org.example;


import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

        @Override
        public boolean add(T element) {

            if (!this.contains(element)) {
                super.add(element);
                this.sort();
                return true;
            }
            return false;
        }

        @Override
        public T remove(int index) {

            T removedElement = super.remove(index);
            this.sort();
            return removedElement;
        }

        public boolean remove(Object element) {
            // Elemanı bulup silme işlemi
            boolean removed = super.remove(element);
            if (removed) {
                this.sort();
            }
            return removed;
        }

        public void sort() {

            Collections.sort(this);
        }

    }