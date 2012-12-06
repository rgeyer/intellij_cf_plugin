/*
 * Copyright (c) 2012 Ryan J. Geyer
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package me.ryangeyer.jetbrains.plugins.lang.cloudflow;

import com.intellij.lexer.Lexer;
import com.intellij.testFramework.LightPlatformTestCase;
import com.sun.tools.javac.resources.javac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ryangeyer
 * Date: 12/5/12
 * Time: 9:55 AM
 */
public class CloudflowLexerTest extends LightPlatformTestCase {

  public void testLexHasSufficientBackstops() {
    try {
      String filepath = "./testData/pcr.def";
      File file = new File(filepath);
      System.out.println(file.getAbsolutePath());
      String text = new Scanner(file).useDelimiter("\\A").next();
      Lexer lexer = new CloudflowLexer();
      lexer.start(text);
      int idx = 0;
      while(lexer.getTokenType() != null) {
        String tokenName = lexer.getTokenType().toString();
        lexer.advance();
        idx++;
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.toString());
    } catch (IOException e) {
      System.out.println(e.toString());
    }
  }

  public void testIgnoresKeywordsInStrings() {
    String text = "\"This has if end else and other crazy keywords\" ";
    Lexer lexer = new CloudflowLexer();
    lexer.start(text);
    int idx = 0;
    String[] expectedTokens = new String[] { "string", "string", "string", "WHITE_SPACE" };
    while(lexer.getTokenType() != null) {
      String tokenName = lexer.getTokenType().toString();
      assertEquals(expectedTokens[idx], tokenName);
      lexer.advance();
      idx++;
    }
  }

  public void testIgnoresKeywordsInStringLiterals() {
    String text = " log_info(\"foo\") in ";
    Lexer lexer = new CloudflowLexer();
    lexer.start(text);
    int idx = 0;
    String[] expectedTokens = new String[] {
      "WHITE_SPACE",
      "nothing",
      "nothing",
      "string",
      "string",
      "string",
      "nothing",
      "WHITE_SPACE",
      "in",
      "WHITE_SPACE"
    };
    while(lexer.getTokenType() != null) {
      String tokenName = lexer.getTokenType().toString();
      assertEquals(expectedTokens[idx], tokenName);
      lexer.advance();
      idx++;
    }
  }

}
