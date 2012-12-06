/* The following code was generated by JFlex 1.4.3 on 12/5/12 3:53 PM */

package me.ryangeyer.jetbrains.plugins.lang.cloudflow;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/5/12 3:53 PM from the specification file
 * <tt>/Users/ryangeyer/Code/Java/intellij_plugins/cloudflow_dsl/src/me/ryangeyer/jetbrains/plugins/lang/cloudflow/Cloudflow.flex</tt>
 */
class _CloudflowLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\2\22\0\1\3\1\0\1\7"+
    "\1\1\1\35\2\0\1\7\10\0\12\6\6\0\1\34\32\5\1\0"+
    "\1\4\2\0\1\6\1\0\1\11\1\27\1\13\1\26\1\20\1\23"+
    "\1\30\1\31\1\22\2\5\1\24\1\10\1\15\1\14\1\12\1\5"+
    "\1\17\1\25\1\21\1\16\1\33\1\32\3\5\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\2\1\5\13\2"+
    "\2\1\1\6\6\2\1\7\1\10\4\2\1\11\1\0"+
    "\1\12\1\0\1\13\3\2\1\14\5\2\1\15\1\16"+
    "\1\17\3\2\1\20\10\2\1\21\2\2\1\22\1\23"+
    "\1\2\1\24\2\2\1\25\2\2\1\26\1\2\1\27"+
    "\1\2\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\74\0\264"+
    "\0\322\0\360\0\u010e\0\u012c\0\u014a\0\u0168\0\u0186\0\u01a4"+
    "\0\u01c2\0\u01e0\0\u01fe\0\u021c\0\74\0\u023a\0\u0258\0\u0276"+
    "\0\u0294\0\u02b2\0\u02d0\0\226\0\226\0\u02ee\0\u030c\0\u032a"+
    "\0\u0348\0\u0366\0\u0384\0\u03a2\0\u03c0\0\226\0\u03de\0\u03fc"+
    "\0\u041a\0\226\0\u0438\0\u0456\0\u0474\0\u0492\0\u04b0\0\u04ce"+
    "\0\u04ec\0\226\0\u050a\0\u0528\0\u0546\0\226\0\u0564\0\u0582"+
    "\0\u05a0\0\u05be\0\u05dc\0\u05fa\0\u0618\0\u0636\0\226\0\u0654"+
    "\0\u0672\0\226\0\226\0\u0690\0\226\0\u06ae\0\u06cc\0\226"+
    "\0\u06ea\0\u0708\0\226\0\u0726\0\226\0\u0744\0\226";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\2\5\1\3\1\6\1\3\1\7\1\10"+
    "\2\6\1\11\3\6\1\12\1\13\1\6\1\14\1\15"+
    "\2\6\1\16\1\17\2\6\1\20\1\6\1\21\1\22"+
    "\2\23\1\5\1\24\1\3\2\23\1\25\26\23\36\0"+
    "\2\4\1\0\33\4\2\0\2\5\37\0\2\6\1\0"+
    "\24\6\7\0\2\6\1\0\1\6\1\26\22\6\7\0"+
    "\2\6\1\0\1\6\1\27\2\6\1\30\17\6\7\0"+
    "\2\6\1\0\10\6\1\31\13\6\7\0\2\6\1\0"+
    "\5\6\1\32\6\6\1\33\7\6\7\0\2\6\1\0"+
    "\5\6\1\34\5\6\1\35\10\6\7\0\2\6\1\0"+
    "\4\6\1\36\17\6\7\0\2\6\1\0\10\6\1\37"+
    "\13\6\7\0\2\6\1\0\10\6\1\40\13\6\7\0"+
    "\2\6\1\0\21\6\1\41\2\6\7\0\1\42\2\0"+
    "\24\42\1\43\6\0\1\44\2\0\24\44\1\0\1\45"+
    "\2\23\1\0\1\23\1\0\2\23\1\0\30\23\1\5"+
    "\1\24\1\0\2\23\1\0\26\23\5\0\2\6\1\0"+
    "\2\6\1\46\21\6\7\0\2\6\1\0\14\6\1\47"+
    "\7\6\7\0\2\6\1\0\5\6\1\50\16\6\7\0"+
    "\2\6\1\0\11\6\1\51\12\6\7\0\2\6\1\0"+
    "\16\6\1\52\5\6\7\0\2\6\1\0\15\6\1\53"+
    "\6\6\7\0\2\6\1\0\7\6\1\54\14\6\7\0"+
    "\2\6\1\0\13\6\1\55\10\6\7\0\2\6\1\0"+
    "\20\6\1\56\3\6\7\0\2\6\1\0\12\6\1\57"+
    "\11\6\7\0\2\42\1\0\24\42\7\0\1\60\2\0"+
    "\24\60\7\0\2\44\1\0\24\44\7\0\1\61\2\0"+
    "\24\61\7\0\2\6\1\0\14\6\1\62\7\6\7\0"+
    "\2\6\1\0\3\6\1\63\20\6\7\0\2\6\1\0"+
    "\6\6\1\64\1\65\14\6\7\0\2\6\1\0\10\6"+
    "\1\66\1\6\1\67\11\6\7\0\2\6\1\0\10\6"+
    "\1\70\13\6\7\0\2\6\1\0\12\6\1\71\11\6"+
    "\7\0\2\6\1\0\12\6\1\72\11\6\7\0\2\6"+
    "\1\0\14\6\1\73\7\6\7\0\2\60\1\0\24\60"+
    "\7\0\2\61\1\0\24\61\7\0\2\6\1\0\6\6"+
    "\1\74\15\6\7\0\2\6\1\0\7\6\1\75\14\6"+
    "\7\0\2\6\1\0\12\6\1\76\11\6\7\0\2\6"+
    "\1\0\13\6\1\77\10\6\7\0\2\6\1\0\1\6"+
    "\1\100\22\6\7\0\2\6\1\0\5\6\1\101\16\6"+
    "\7\0\2\6\1\0\5\6\1\102\16\6\7\0\2\6"+
    "\1\0\10\6\1\103\13\6\7\0\2\6\1\0\7\6"+
    "\1\104\14\6\7\0\2\6\1\0\5\6\1\105\16\6"+
    "\7\0\2\6\1\0\10\6\1\106\13\6\7\0\2\6"+
    "\1\0\3\6\1\107\20\6\7\0\2\6\1\0\10\6"+
    "\1\110\13\6\7\0\2\6\1\0\7\6\1\111\14\6"+
    "\7\0\2\6\1\0\23\6\1\112\7\0\2\6\1\0"+
    "\21\6\1\113\2\6\7\0\2\6\1\0\10\6\1\114"+
    "\13\6\7\0\2\6\1\0\10\6\1\115\13\6\7\0"+
    "\2\6\1\0\5\6\1\116\16\6\7\0\2\6\1\0"+
    "\11\6\1\117\12\6\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1890];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\11\3\1\1\11\15\1\1\11\15\1"+
    "\1\0\1\1\1\0\52\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[79];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private IElementType process(IElementType type) {
    if(yystate() != STRING) {
      return type;
    } else {
      return CloudflowTokenTypes.tSTRING;
    }
  }


  _CloudflowLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _CloudflowLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 96) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  // For Demetra compatibility
  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzBufferArray = null;
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = buffer.length();
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]:zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]:zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 9: 
          { return process(CloudflowTokenTypes.resCOLLECTION);
          }
        case 25: break;
        case 1: 
          { return CloudflowTokenTypes.tSTRING;
          }
        case 26: break;
        case 10: 
          { return process(CloudflowTokenTypes.tVAR);
          }
        case 27: break;
        case 18: 
          { return process(CloudflowTokenTypes.kBEGIN);
          }
        case 28: break;
        case 13: 
          { return process(CloudflowTokenTypes.resGLOBALCOLLECTION);
          }
        case 29: break;
        case 23: 
          { return process(CloudflowTokenTypes.kRETRIEVE);
          }
        case 30: break;
        case 14: 
          { return process(CloudflowTokenTypes.tGLOBALVAR);
          }
        case 31: break;
        case 8: 
          { return process(CloudflowTokenTypes.kIF);
          }
        case 32: break;
        case 5: 
          { yybegin(STRING); return CloudflowTokenTypes.tSTRING;
          }
        case 33: break;
        case 4: 
          { return CloudflowTokenTypes.WHITE_SPACE;
          }
        case 34: break;
        case 15: 
          { return process(CloudflowTokenTypes.kCALL);
          }
        case 35: break;
        case 11: 
          { return process(CloudflowTokenTypes.kMAP);
          }
        case 36: break;
        case 2: 
          { return CloudflowTokenTypes.tSTUB;
          }
        case 37: break;
        case 17: 
          { return process(CloudflowTokenTypes.kELSIF);
          }
        case 38: break;
        case 19: 
          { return process(CloudflowTokenTypes.kWHILE);
          }
        case 39: break;
        case 6: 
          { yybegin(YYINITIAL); return CloudflowTokenTypes.tSTRING;
          }
        case 40: break;
        case 24: 
          { return process(CloudflowTokenTypes.kCONCURRENT);
          }
        case 41: break;
        case 21: 
          { return process(CloudflowTokenTypes.kDEFINE);
          }
        case 42: break;
        case 16: 
          { return process(CloudflowTokenTypes.kELSE);
          }
        case 43: break;
        case 7: 
          { return process(CloudflowTokenTypes.kIN);
          }
        case 44: break;
        case 12: 
          { return process(CloudflowTokenTypes.kEND);
          }
        case 45: break;
        case 3: 
          { yybegin(YYINITIAL); return CloudflowTokenTypes.tCOMMENT;
          }
        case 46: break;
        case 22: 
          { return process(CloudflowTokenTypes.kFOREACH);
          }
        case 47: break;
        case 20: 
          { return process(CloudflowTokenTypes.kRETURN);
          }
        case 48: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
