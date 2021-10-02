package org.example;

public class WithManifold
{
    public static void main(String[] args)
    {
        System.out.println(args.stream().mapToInt(s -> s.bytes.length).sum());
    }
}
