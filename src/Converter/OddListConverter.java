package Converter;

import java.util.List;

    public class OddListConverter implements ListStrategy {

        @Override
        public String listToString(List list) {
            int ind=0;
            Boolean odd = true;
            String returnMe = "";

            while (ind<list.size()) {
                returnMe += list.get(ind).toString();

                if (odd) {
                    odd=false;
                } else {
                    returnMe += "\n";
                    odd = true;
                }
                ind++;
            }

            return returnMe;
        }

    }