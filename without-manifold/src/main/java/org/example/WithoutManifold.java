package org.example;

public class WithoutManifold
{
    public static void main(String[] args)
    {
        System.out.println(args.stream().mapToInt(s -> s.bytes.length).sum());
    }
}
