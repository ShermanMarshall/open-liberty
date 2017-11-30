/*
 * IBM Confidential
 *
 * OCO Source Materials
 *
 * Copyright IBM Corp. 2011, 2017
 *
 * The source code for this program is not published or otherwise divested 
 * of its trade secrets, irrespective of what has been deposited with the 
 * U.S. Copyright Office.
 */
package com.ibm.ws.artifact.fat_bvt.servlet.filesystem;

/**
 * <p>Directory test file set.</p>
 */
public class DirFileSystem {
    public static FileSystem TESTDATA =
        FileSystem.root( null, null, null,
                 FileSystem.DOES_NOT_HAVE_DATA, null, 0,
                 "#\\TESTDATA",
                 1, new String[] { "file:#/TESTDATA/" },

                 FileSystem.dir( "a", "/a",
                         "file:#/TESTDATA/a/", "#\\TESTDATA\\a",
                         1, new String[] { "file:#/TESTDATA/a/" },

                         FileSystem.File( "a.txt", "/a/a.txt",
                                  FileSystem.DOES_HAVE_DATA, "", 0,
                                  "file:#/TESTDATA/a/a.txt", "#\\TESTDATA\\a\\a.txt" ),

                         FileSystem.dir( "aa", "/a/aa",
                                 "file:#/TESTDATA/a/aa/", "#\\TESTDATA\\a\\aa",
                                 1, new String[] { "file:#/TESTDATA/a/aa/" },

                                 FileSystem.File( "aa.txt", "/a/aa/aa.txt",
                                          FileSystem.DOES_HAVE_DATA, "wibble", 6,
                                          "file:#/TESTDATA/a/aa/aa.txt",  "#\\TESTDATA\\a\\aa\\aa.txt" ) ),

                         FileSystem.dir("ab", "/a/ab",
                                "file:#/TESTDATA/a/ab/", "#\\TESTDATA\\a\\ab",
                                1, new String[] { "file:#/TESTDATA/a/ab/" },

                                FileSystem.File( "ab.txt", "/a/ab/ab.txt",
                                         FileSystem.DOES_HAVE_DATA, "fish", 4,
                                         "file:#/TESTDATA/a/ab/ab.txt", "#\\TESTDATA\\a\\ab\\ab.txt" ),

                                FileSystem.dir( "aba", "/a/ab/aba",
                                        "file:#/TESTDATA/a/ab/aba/", "#\\TESTDATA\\a\\ab\\aba",
                                        1, new String[] { "file:#/TESTDATA/a/ab/aba/" },

                                        FileSystem.File( "aba.txt", "/a/ab/aba/aba.txt",
                                                 FileSystem.DOES_HAVE_DATA, "cheese", 6,
                                                 "file:#/TESTDATA/a/ab/aba/aba.txt", "#\\TESTDATA\\a\\ab\\aba\\aba.txt" ) ) ) ),

                 FileSystem.dir( "b", "/b",
                         "file:#/TESTDATA/b/", "#\\TESTDATA\\b",
                         1, new String[] { "file:#/TESTDATA/b/" },

                         FileSystem.dir( "ba", "/b/ba",
                                 "file:#/TESTDATA/b/ba/", "#\\TESTDATA\\b\\ba",
                                 1, new String[] { "file:#/TESTDATA/b/ba/" },

                                 FileSystem.dir( "baa", "/b/ba/baa",
                                         "file:#/TESTDATA/b/ba/baa/", "#\\TESTDATA\\b\\ba\\baa",
                                         1, new String[] { "file:#/TESTDATA/b/ba/baa/" },

                                         FileSystem.File( "baa1.txt", "/b/ba/baa/baa1.txt",
                                                  FileSystem.DOES_HAVE_DATA, "minion", 6,
                                                  "file:#/TESTDATA/b/ba/baa/baa1.txt", "#\\TESTDATA\\b\\ba\\baa\\baa1.txt" ),

                                         FileSystem.File( "baa2.txt", "/b/ba/baa/baa2.txt",
                                                  FileSystem.DOES_HAVE_DATA, "chain", 5,
                                                  "file:#/TESTDATA/b/ba/baa/baa2.txt", "#\\TESTDATA\\b\\ba\\baa\\baa2.txt" ) ) ),

                         FileSystem.dir( "bb", "/b/bb",
                                 "file:#/TESTDATA/b/bb/", "#\\TESTDATA\\b\\bb",
                                 1, new String[] { "file:#/TESTDATA/b/bb/" },

                                 FileSystem.root( "a.jar", "/b/bb/a.jar", "file:#/TESTDATA/b/bb/a.jar",
                                          FileSystem.DOES_NOT_HAVE_DATA, null, 967,
                                          "#\\TESTDATA\\b\\bb\\a.jar",
                                          1, new String[] { "jar:file:#/TESTDATA/b/bb/a.jar!/" },

                                          FileSystem.dir( "aa", "/aa",
                                                  "jar:file:#/TESTDATA/b/bb/a.jar!/aa", null,
                                                  1, new String[] { "jar:file:#/TESTDATA/b/bb/a.jar!/aa/" },

                                                  FileSystem.File( "aa.txt", "/aa/aa.txt",
                                                           FileSystem.DOES_HAVE_DATA, "", 0,
                                                           "jar:file:#/TESTDATA/b/bb/a.jar!/aa/aa.txt", null ) ),

                                          FileSystem.dir( "ab", "/ab",
                                                  "jar:file:#/TESTDATA/b/bb/a.jar!/ab", null,
                                                  1, new String[] { "jar:file:#/TESTDATA/b/bb/a.jar!/ab/" },

                                                  FileSystem.dir( "aba", "/ab/aba",
                                                          "jar:file:#/TESTDATA/b/bb/a.jar!/ab/aba", null,
                                                          1, new String[] { "jar:file:#/TESTDATA/b/bb/a.jar!/ab/aba/" },

                                                          FileSystem.File( "aba.txt", "/ab/aba/aba.txt",
                                                                   FileSystem.DOES_HAVE_DATA, "", 0,
                                                                   "jar:file:#/TESTDATA/b/bb/a.jar!/ab/aba/aba.txt", null ) ),

                                                  FileSystem.File( "ab.txt", "/ab/ab.txt",
                                                           FileSystem.DOES_HAVE_DATA, "", 0,
                                                           "jar:file:#/TESTDATA/b/bb/a.jar!/ab/ab.txt", null ) ),

                                          FileSystem.File( "a.txt", "/a.txt",
                                                   FileSystem.DOES_HAVE_DATA, "", 0,
                                                   "jar:file:#/TESTDATA/b/bb/a.jar!/a.txt", null ),

                                          FileSystem.dir( "META-INF", "/META-INF",
                                                  "jar:file:#/TESTDATA/b/bb/a.jar!/META-INF", null,
                                                  1, new String[] { "jar:file:#/TESTDATA/b/bb/a.jar!/META-INF/" },

                                                  FileSystem.File( "MANIFEST.MF", "/META-INF/MANIFEST.MF",
                                                           FileSystem.DOES_HAVE_DATA, "Manifest-Version: 1.0\r\nCreated-By: 1.6.0 (IBM Corporation)\r\n\r\n", 62, 
                                                           "jar:file:#/TESTDATA/b/bb/a.jar!/META-INF/MANIFEST.MF", null ) ) ) ) ),

                 FileSystem.dir( "c", "/c",
                         "file:#/TESTDATA/c/", "#\\TESTDATA\\c",
                         1, new String[] { "file:#/TESTDATA/c/" },

                         FileSystem.root( "a.jar", "/c/a.jar", "file:#/TESTDATA/c/a.jar",
                                  FileSystem.DOES_NOT_HAVE_DATA, null, 967, "#\\TESTDATA\\c\\a.jar",
                                  1, new String[] { "jar:file:#/TESTDATA/c/a.jar!/" },

                                  FileSystem.dir( "aa", "/aa",
                                          "jar:file:#/TESTDATA/c/a.jar!/aa", null,
                                          1, new String[] { "jar:file:#/TESTDATA/c/a.jar!/aa/" },

                                          FileSystem.File( "aa.txt", "/aa/aa.txt",
                                                   FileSystem.DOES_HAVE_DATA, "", 0,
                                                   "jar:file:#/TESTDATA/c/a.jar!/aa/aa.txt", null ) ),

                                  FileSystem.dir( "ab", "/ab",
                                          "jar:file:#/TESTDATA/c/a.jar!/ab", null,
                                          1, new String[] { "jar:file:#/TESTDATA/c/a.jar!/ab/" },

                                          FileSystem.dir( "aba", "/ab/aba",
                                                  "jar:file:#/TESTDATA/c/a.jar!/ab/aba", null,
                                                  1, new String[] { "jar:file:#/TESTDATA/c/a.jar!/ab/aba/" },

                                                  FileSystem.File( "aba.txt", "/ab/aba/aba.txt",
                                                           FileSystem.DOES_HAVE_DATA, "", 0,
                                                           "jar:file:#/TESTDATA/c/a.jar!/ab/aba/aba.txt", null ) ),

                                          FileSystem.File( "ab.txt", "/ab/ab.txt",
                                                   FileSystem.DOES_HAVE_DATA, "", 0,
                                                   "jar:file:#/TESTDATA/c/a.jar!/ab/ab.txt", null ) ),

                                  FileSystem.File( "a.txt", "/a.txt",
                                           FileSystem.DOES_HAVE_DATA, "", 0,
                                           "jar:file:#/TESTDATA/c/a.jar!/a.txt", null ),

                                  FileSystem.dir( "META-INF", "/META-INF",
                                          "jar:file:#/TESTDATA/c/a.jar!/META-INF", null,
                                          1, new String[] { "jar:file:#/TESTDATA/c/a.jar!/META-INF/" },

                                          FileSystem.File( "MANIFEST.MF", "/META-INF/MANIFEST.MF",
                                                   FileSystem.DOES_HAVE_DATA, "Manifest-Version: 1.0\r\nCreated-By: 1.6.0 (IBM Corporation)\r\n\r\n", 62, 
                                                   "jar:file:#/TESTDATA/c/a.jar!/META-INF/MANIFEST.MF", null ) ) ),

                         FileSystem.root( "b.jar", "/c/b.jar", "file:#/TESTDATA/c/b.jar",
                                  FileSystem.DOES_NOT_HAVE_DATA, null, 1227,
                                  "#\\TESTDATA\\c\\b.jar",
                                  1, new String[] { "jar:file:#/TESTDATA/c/b.jar!/" },

                                  FileSystem.dir( "bb", "/bb",
                                          "jar:file:#/TESTDATA/c/b.jar!/bb", null,
                                          1, new String[] { "jar:file:#/TESTDATA/c/b.jar!/bb/" },

                                          FileSystem.root( "a.jar", "/bb/a.jar", "jar:file:#/TESTDATA/c/b.jar!/bb/a.jar",
                                                   FileSystem.DOES_NOT_HAVE_DATA, null, 967,
                                                   null,
                                                   1, new String[] { "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/" },

                                                   FileSystem.dir( "aa", "/aa",
                                                           "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/aa", null,
                                                           1, new String[] { "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/aa/" },

                                                           FileSystem.File( "aa.txt", "/aa/aa.txt",
                                                                    FileSystem.DOES_HAVE_DATA, "", 0, 
                                                                    "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/aa/aa.txt", null ) ),

                                                   FileSystem.dir( "ab", "/ab",
                                                           "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/ab", null,
                                                           1, new String[] { "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/ab/" },

                                                           FileSystem.dir( "aba", "/ab/aba",
                                                                   "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/ab/aba", null,
                                                                   1, new String[] { "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/ab/aba/" },

                                                                   FileSystem.File( "aba.txt", "/ab/aba/aba.txt",
                                                                            FileSystem.DOES_HAVE_DATA, "", 0,
                                                                            "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/ab/aba/aba.txt", null ) ),

                                                           FileSystem.File( "ab.txt", "/ab/ab.txt",
                                                                    FileSystem.DOES_HAVE_DATA, "", 0, 
                                                                    "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/ab/ab.txt", null ) ),

                                                   FileSystem.File( "a.txt", "/a.txt",
                                                            FileSystem.DOES_HAVE_DATA, "", 0,
                                                            "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/a.txt", null ),

                                                   FileSystem.dir( "META-INF", "/META-INF",
                                                           "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/META-INF", null,
                                                           1, new String[] { "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/META-INF/" },

                                                           FileSystem.File( "MANIFEST.MF", "/META-INF/MANIFEST.MF",
                                                                    FileSystem.DOES_HAVE_DATA, "Manifest-Version: 1.0\r\nCreated-By: 1.6.0 (IBM Corporation)\r\n\r\n", 62, 
                                                                    "jar:file:#/cacheDir/.cache/b.jar/bb/a.jar!/META-INF/MANIFEST.MF", null ) ) ) ),

                                  FileSystem.dir( "META-INF", "/META-INF",
                                          "jar:file:#/TESTDATA/c/b.jar!/META-INF", null,
                                          1, new String[] { "jar:file:#/TESTDATA/c/b.jar!/META-INF/" },

                                          FileSystem.File( "MANIFEST.MF", "/META-INF/MANIFEST.MF",
                                                   FileSystem.DOES_HAVE_DATA, "Manifest-Version: 1.0\r\nCreated-By: 1.6.0 (IBM Corporation)\r\n\r\n", 62, 
                                                   "jar:file:#/TESTDATA/c/b.jar!/META-INF/MANIFEST.MF", null ) ),

                                  FileSystem.dir( "ba", "/ba",
                                          "jar:file:#/TESTDATA/c/b.jar!/ba", null,
                                          1, new String[] { "jar:file:#/TESTDATA/c/b.jar!/ba/" },

                                          FileSystem.dir( "baa", "/ba/baa",
                                                  "jar:file:#/TESTDATA/c/b.jar!/ba/baa", null,
                                                  1, new String[] { "jar:file:#/TESTDATA/c/b.jar!/ba/baa/" },

                                                  FileSystem.File( "baa1.txt", "/ba/baa/baa1.txt",
                                                           FileSystem.DOES_HAVE_DATA, "", 0,
                                                           "jar:file:#/TESTDATA/c/b.jar!/ba/baa/baa1.txt", null ),

                                                  FileSystem.File( "baa2.txt", "/ba/baa/baa2.txt",
                                                           FileSystem.DOES_HAVE_DATA, "", 0,
                                                           "jar:file:#/TESTDATA/c/b.jar!/ba/baa/baa2.txt", null ) ) ) ) ) );
}
