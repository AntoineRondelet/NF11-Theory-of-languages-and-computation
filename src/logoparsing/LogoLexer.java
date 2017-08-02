// Generated from grammar/Logo.g4 by ANTLR 4.6

  package logoparsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, NB=26, WS=27, BOOLEAN=28, POUR=29, FIN=30, VAR=31, VUSE=32, 
		NAME=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"NB", "WS", "BOOLEAN", "POUR", "FIN", "VAR", "VUSE", "NAME"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'av'", "'td'", "'tg'", "'lc'", "'bc'", "'ve'", "'re'", "'fcc'", 
		"'fpos'", "'repete'", "'['", "']'", "'donne'", "'si'", "'tantque'", "'rends'", 
		"'^'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'hasard'", "'loop'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NB", "WS", "BOOLEAN", "POUR", "FIN", "VAR", "VUSE", "NAME"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\7\33\u00a3\n\33\f\33\16\33\u00a6\13\33\3\33"+
		"\7\33\u00a9\n\33\f\33\16\33\u00ac\13\33\3\33\3\33\3\33\7\33\u00b1\n\33"+
		"\f\33\16\33\u00b4\13\33\5\33\u00b6\n\33\3\34\6\34\u00b9\n\34\r\34\16\34"+
		"\u00ba\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00c7\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00d5"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00e0\n\37\3 "+
		"\3 \3 \7 \u00e5\n \f \16 \u00e8\13 \3!\3!\3!\7!\u00ed\n!\f!\16!\u00f0"+
		"\13!\3\"\3\"\7\"\u00f4\n\"\f\"\16\"\u00f7\13\"\2\2#\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\t\3\2"+
		"\63;\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\"\4\2>>@@\4\2C\\c|\5\2\62;C\\"+
		"c|\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2"+
		"\5H\3\2\2\2\7K\3\2\2\2\tN\3\2\2\2\13Q\3\2\2\2\rT\3\2\2\2\17W\3\2\2\2\21"+
		"Z\3\2\2\2\23^\3\2\2\2\25c\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2"+
		"\35t\3\2\2\2\37w\3\2\2\2!\177\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'"+
		"\u0089\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2"+
		"\2\2\61\u0093\3\2\2\2\63\u009a\3\2\2\2\65\u00b5\3\2\2\2\67\u00b8\3\2\2"+
		"\29\u00c6\3\2\2\2;\u00d4\3\2\2\2=\u00df\3\2\2\2?\u00e1\3\2\2\2A\u00e9"+
		"\3\2\2\2C\u00f1\3\2\2\2EF\7c\2\2FG\7x\2\2G\4\3\2\2\2HI\7v\2\2IJ\7f\2\2"+
		"J\6\3\2\2\2KL\7v\2\2LM\7i\2\2M\b\3\2\2\2NO\7n\2\2OP\7e\2\2P\n\3\2\2\2"+
		"QR\7d\2\2RS\7e\2\2S\f\3\2\2\2TU\7x\2\2UV\7g\2\2V\16\3\2\2\2WX\7t\2\2X"+
		"Y\7g\2\2Y\20\3\2\2\2Z[\7h\2\2[\\\7e\2\2\\]\7e\2\2]\22\3\2\2\2^_\7h\2\2"+
		"_`\7r\2\2`a\7q\2\2ab\7u\2\2b\24\3\2\2\2cd\7t\2\2de\7g\2\2ef\7r\2\2fg\7"+
		"g\2\2gh\7v\2\2hi\7g\2\2i\26\3\2\2\2jk\7]\2\2k\30\3\2\2\2lm\7_\2\2m\32"+
		"\3\2\2\2no\7f\2\2op\7q\2\2pq\7p\2\2qr\7p\2\2rs\7g\2\2s\34\3\2\2\2tu\7"+
		"u\2\2uv\7k\2\2v\36\3\2\2\2wx\7v\2\2xy\7c\2\2yz\7p\2\2z{\7v\2\2{|\7s\2"+
		"\2|}\7w\2\2}~\7g\2\2~ \3\2\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7f\2\2\u0083\u0084\7u\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\7`\2\2\u0086$\3\2\2\2\u0087\u0088\7,\2\2\u0088&\3\2\2\2\u0089\u008a"+
		"\7\61\2\2\u008a(\3\2\2\2\u008b\u008c\7-\2\2\u008c*\3\2\2\2\u008d\u008e"+
		"\7/\2\2\u008e,\3\2\2\2\u008f\u0090\7*\2\2\u0090.\3\2\2\2\u0091\u0092\7"+
		"+\2\2\u0092\60\3\2\2\2\u0093\u0094\7j\2\2\u0094\u0095\7c\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\u0099\7f\2\2\u0099"+
		"\62\3\2\2\2\u009a\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7r\2\2\u009e\64\3\2\2\2\u009f\u00b6\7\62\2\2\u00a0\u00a4\t\2\2"+
		"\2\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a9\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\t\4\2\2\u00ae\u00b2\t\3\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u009f\3\2\2\2\u00b5\u00a0\3\2"+
		"\2\2\u00b5\u00aa\3\2\2\2\u00b6\66\3\2\2\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\34\2\2\u00bd8\3\2\2\2\u00be\u00c7\t\6\2\2"+
		"\u00bf\u00c0\7>\2\2\u00c0\u00c7\7?\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c7"+
		"\7?\2\2\u00c3\u00c7\7?\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c7\7?\2\2\u00c6"+
		"\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c3\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7:\3\2\2\2\u00c8\u00c9\7R\2\2\u00c9\u00ca"+
		"\7Q\2\2\u00ca\u00cb\7W\2\2\u00cb\u00d5\7T\2\2\u00cc\u00cd\7r\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d5\7t\2\2\u00d0\u00d1\7R\2\2"+
		"\u00d1\u00d2\7q\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d5\7t\2\2\u00d4\u00c8"+
		"\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5<\3\2\2\2\u00d6"+
		"\u00d7\7H\2\2\u00d7\u00d8\7K\2\2\u00d8\u00e0\7P\2\2\u00d9\u00da\7h\2\2"+
		"\u00da\u00db\7k\2\2\u00db\u00e0\7p\2\2\u00dc\u00dd\7H\2\2\u00dd\u00de"+
		"\7k\2\2\u00de\u00e0\7p\2\2\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00dc\3\2\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2\u00e6\t\7\2\2\u00e3"+
		"\u00e5\t\b\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7@\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\7<\2\2\u00ea\u00ee\t\7\2\2\u00eb\u00ed\t\b\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efB\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f5\t\7\2\2\u00f2\u00f4\t\b\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"D\3\2\2\2\u00f7\u00f5\3\2\2\2\16\2\u00a4\u00aa\u00b2\u00b5\u00ba\u00c6"+
		"\u00d4\u00df\u00e6\u00ee\u00f5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}