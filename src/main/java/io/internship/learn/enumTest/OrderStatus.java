package io.internship.learn.enumTest;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum OrderStatus {

    PLACED() {
        @Override
        public boolean isPlaced() {
            return true;
        }
    },

    ACCEPTED() {
        @Override
        public boolean isAccepted() {
            return true;
        }
    },
    PROCESSING() {
        @Override
        public boolean isProcessing() {
            return true;
        }
    },
    TERMINATED() {
        @Override
        public boolean isTerminated() {
            return false;
        }
    },
    DELIVERED() {
        @Override
        public boolean isDelivered() {
            return true;
        }
    };


    public boolean isPlaced() {
        return false;
    }


    public boolean isAccepted() {
        return false;
    }

    public boolean isProcessing() {

        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public boolean isDelivered() {
        return false;
    }


    public static OrderStatus fromValue(String value) {
        Map<String, OrderStatus> result = Stream.of(values()).collect(Collectors.toMap(Object::toString, o -> o));
        return result.get(value);
    }
}
