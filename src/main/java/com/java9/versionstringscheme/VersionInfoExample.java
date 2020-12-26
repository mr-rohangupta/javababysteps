package com.java9.versionstringscheme;

public class VersionInfoExample {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Current version is " + version);
        System.out.println("Major version number " + version.major());
        System.out.println("Minor version number " + version.minor());
        System.out.println("Security version number " + version.security());
        System.out.println("Pre-released information " + version.pre());
        System.out.println("Build Number " + version.build());
    }
}
