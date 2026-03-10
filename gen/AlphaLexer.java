// Generated from C:/Users/Daniel/IdeaProjects/AlphaParser/AlphaLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AlphaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, DO=5, LET=6, IN=7, BEGIN=8, END=9, CONST=10, 
		VAR=11, SEMI=12, ASSIGN=13, LEFTP=14, RIGHTP=15, TILDE=16, COLON=17, ADD=18, 
		SUB=19, MUL=20, DIV=21, MOD=22, EQEQ=23, NOTEQ=24, LESS=25, MORET=26, 
		LESSEQ=27, MOREEQ=28, ID=29, INTLIT=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", "END", "CONST", 
			"VAR", "SEMI", "ASSIGN", "LEFTP", "RIGHTP", "TILDE", "COLON", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "EQEQ", "NOTEQ", "LESS", "MORET", "LESSEQ", 
			"MOREEQ", "ID", "INTLIT", "WS", "LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'do'", "'let'", "'in'", 
			"'begin'", "'end'", "'const'", "'var'", "';'", "':='", "'('", "')'", 
			"'~'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "WHILE", "DO", "LET", "IN", "BEGIN", "END", 
			"CONST", "VAR", "SEMI", "ASSIGN", "LEFTP", "RIGHTP", "TILDE", "COLON", 
			"ADD", "SUB", "MUL", "DIV", "MOD", "EQEQ", "NOTEQ", "LESS", "MORET", 
			"LESSEQ", "MOREEQ", "ID", "INTLIT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public AlphaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlphaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u009f\b\u001c\n\u001c\f\u001c\u00a2\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u00a6\b\u001d\n\u001d\f\u001d\u00a9\t\u001d\u0001\u001e"+
		"\u0004\u001e\u00ac\b\u001e\u000b\u001e\f\u001e\u00ad\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0000\u0000!\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f?\u0000A\u0000\u0001"+
		"\u0000\u0003\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0001\u000009\u00b6"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000\u0000\u0003F\u0001\u0000"+
		"\u0000\u0000\u0005K\u0001\u0000\u0000\u0000\u0007P\u0001\u0000\u0000\u0000"+
		"\tV\u0001\u0000\u0000\u0000\u000bY\u0001\u0000\u0000\u0000\r]\u0001\u0000"+
		"\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011f\u0001\u0000\u0000\u0000"+
		"\u0013j\u0001\u0000\u0000\u0000\u0015p\u0001\u0000\u0000\u0000\u0017t"+
		"\u0001\u0000\u0000\u0000\u0019v\u0001\u0000\u0000\u0000\u001by\u0001\u0000"+
		"\u0000\u0000\u001d{\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000\u0000"+
		"!\u007f\u0001\u0000\u0000\u0000#\u0081\u0001\u0000\u0000\u0000%\u0083"+
		"\u0001\u0000\u0000\u0000\'\u0085\u0001\u0000\u0000\u0000)\u0087\u0001"+
		"\u0000\u0000\u0000+\u0089\u0001\u0000\u0000\u0000-\u008b\u0001\u0000\u0000"+
		"\u0000/\u008e\u0001\u0000\u0000\u00001\u0091\u0001\u0000\u0000\u00003"+
		"\u0093\u0001\u0000\u0000\u00005\u0095\u0001\u0000\u0000\u00007\u0098\u0001"+
		"\u0000\u0000\u00009\u009b\u0001\u0000\u0000\u0000;\u00a3\u0001\u0000\u0000"+
		"\u0000=\u00ab\u0001\u0000\u0000\u0000?\u00b1\u0001\u0000\u0000\u0000A"+
		"\u00b3\u0001\u0000\u0000\u0000CD\u0005i\u0000\u0000DE\u0005f\u0000\u0000"+
		"E\u0002\u0001\u0000\u0000\u0000FG\u0005t\u0000\u0000GH\u0005h\u0000\u0000"+
		"HI\u0005e\u0000\u0000IJ\u0005n\u0000\u0000J\u0004\u0001\u0000\u0000\u0000"+
		"KL\u0005e\u0000\u0000LM\u0005l\u0000\u0000MN\u0005s\u0000\u0000NO\u0005"+
		"e\u0000\u0000O\u0006\u0001\u0000\u0000\u0000PQ\u0005w\u0000\u0000QR\u0005"+
		"h\u0000\u0000RS\u0005i\u0000\u0000ST\u0005l\u0000\u0000TU\u0005e\u0000"+
		"\u0000U\b\u0001\u0000\u0000\u0000VW\u0005d\u0000\u0000WX\u0005o\u0000"+
		"\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005l\u0000\u0000Z[\u0005e\u0000"+
		"\u0000[\\\u0005t\u0000\u0000\\\f\u0001\u0000\u0000\u0000]^\u0005i\u0000"+
		"\u0000^_\u0005n\u0000\u0000_\u000e\u0001\u0000\u0000\u0000`a\u0005b\u0000"+
		"\u0000ab\u0005e\u0000\u0000bc\u0005g\u0000\u0000cd\u0005i\u0000\u0000"+
		"de\u0005n\u0000\u0000e\u0010\u0001\u0000\u0000\u0000fg\u0005e\u0000\u0000"+
		"gh\u0005n\u0000\u0000hi\u0005d\u0000\u0000i\u0012\u0001\u0000\u0000\u0000"+
		"jk\u0005c\u0000\u0000kl\u0005o\u0000\u0000lm\u0005n\u0000\u0000mn\u0005"+
		"s\u0000\u0000no\u0005t\u0000\u0000o\u0014\u0001\u0000\u0000\u0000pq\u0005"+
		"v\u0000\u0000qr\u0005a\u0000\u0000rs\u0005r\u0000\u0000s\u0016\u0001\u0000"+
		"\u0000\u0000tu\u0005;\u0000\u0000u\u0018\u0001\u0000\u0000\u0000vw\u0005"+
		":\u0000\u0000wx\u0005=\u0000\u0000x\u001a\u0001\u0000\u0000\u0000yz\u0005"+
		"(\u0000\u0000z\u001c\u0001\u0000\u0000\u0000{|\u0005)\u0000\u0000|\u001e"+
		"\u0001\u0000\u0000\u0000}~\u0005~\u0000\u0000~ \u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005:\u0000\u0000\u0080\"\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005+\u0000\u0000\u0082$\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"-\u0000\u0000\u0084&\u0001\u0000\u0000\u0000\u0085\u0086\u0005*\u0000"+
		"\u0000\u0086(\u0001\u0000\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088"+
		"*\u0001\u0000\u0000\u0000\u0089\u008a\u0005%\u0000\u0000\u008a,\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c\u008d\u0005=\u0000"+
		"\u0000\u008d.\u0001\u0000\u0000\u0000\u008e\u008f\u0005!\u0000\u0000\u008f"+
		"\u0090\u0005=\u0000\u0000\u00900\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"<\u0000\u0000\u00922\u0001\u0000\u0000\u0000\u0093\u0094\u0005>\u0000"+
		"\u0000\u00944\u0001\u0000\u0000\u0000\u0095\u0096\u0005<\u0000\u0000\u0096"+
		"\u0097\u0005=\u0000\u0000\u00976\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		">\u0000\u0000\u0099\u009a\u0005=\u0000\u0000\u009a8\u0001\u0000\u0000"+
		"\u0000\u009b\u00a0\u0003?\u001f\u0000\u009c\u009f\u0003?\u001f\u0000\u009d"+
		"\u009f\u0003A \u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1:\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a7\u0003A \u0000"+
		"\u00a4\u00a6\u0003A \u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8<\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0007\u0000\u0000\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0006\u001e\u0000\u0000\u00b0>\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0007\u0001\u0000\u0000\u00b2@\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0007\u0002\u0000\u0000\u00b4B\u0001\u0000\u0000\u0000"+
		"\u0005\u0000\u009e\u00a0\u00a7\u00ad\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}