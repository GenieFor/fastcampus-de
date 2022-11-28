package com.fastcampus.de.clip12;

public class MethodExceptionSignature {

    static void methodThrowsException() throws Exception { }

    static void methodThrowsRuntimeException() throws RuntimeException { }

    public static void main(String[] args) {
        /*
            그냥 Exception 같은 경우는 컴파일에 대한 에러까지 포함하고 있어서
            try~catch 로 감싸지 않으면 코드상에서 에러문구 발생
         */
        try {
            methodThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
            RuntimeException 같은 경우는 이미 컴파일이 끝난 후의 것만 확인하므로
            따로 try~catch 구문이 없어도 코드상에서 에러문구가 발생하지 않음
         */
        methodThrowsRuntimeException();
    }
}
