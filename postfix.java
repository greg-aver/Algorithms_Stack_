public Integer postfix() {
       
        Stack<Integer> operation = new Stack<Integer>();
        while (this.size() != 0) {
            String value = String.valueOf(this.pop());

            switch (value) {
                case ("*"):
                    operation.push(
                            operation.pop() * operation.pop()
                    );
                    break;
                case ("-"):
                    operation.push(
                             - operation.pop() + operation.pop()
                    );
                    break;
                case ("+"):
                    operation.push(
                        operation.pop() + operation.pop()
                    );
                    break;
                case ("="):
                    return operation.pop();
                default:
                    operation.push(Integer.valueOf(value));
                    break;
            }
        }

        return operation.pop();
    }
