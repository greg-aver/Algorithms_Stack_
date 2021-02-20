public static boolean brackets(String str) {
        
        if (str.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char symbol;
        for (int i=0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '(') {
                stack.push(symbol);
            } else {
                if (stack.peek() == null) {
                    return false;
                }
                stack.pop();
            }
        }

        if (stack.size() == 0) {
            return true;
        }

        return false;
    }
