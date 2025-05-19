// Generated from c:/Users/Gladys/ssl-antlr-calculator/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Prefijo=1, Nombre=2, Argumento=3, ArgumentoPosicional=4, ArgumentoOpcional=5, 
		NombreArgumento=6, ValorArgumento=7, TEXTO=8, NUMERO=9, PALABRA=10, LETRA=11, 
		ESPACIOS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Prefijo", "Nombre", "Argumento", "ArgumentoPosicional", "ArgumentoOpcional", 
			"NombreArgumento", "ValorArgumento", "TEXTO", "NUMERO", "PALABRA", "LETRA", 
			"ESPACIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Prefijo", "Nombre", "Argumento", "ArgumentoPosicional", "ArgumentoOpcional", 
			"NombreArgumento", "ValorArgumento", "TEXTO", "NUMERO", "PALABRA", "LETRA", 
			"ESPACIOS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analizador.g4"; }

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
		"\u0004\u0000\fY\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003%\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004-\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u00052\b\u0005\n\u0005\f\u00055\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006:\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u0007>\b\u0007\n\u0007\f\u0007A\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0004\bF\b\b\u000b\b\f\bG\u0001\t\u0001\t\u0005\tL\b\t\n\t\f"+
		"\tO\t\t\u0001\n\u0001\n\u0001\u000b\u0004\u000bT\b\u000b\u000b\u000b\f"+
		"\u000bU\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0001\u0000\u0007\u0004\u0000!!&&//??\u0003\u0000"+
		"\n\n\r\r\"\"\u0001\u000009\u000f\u0000AZ__az\u00c1\u00c1\u00c9\u00c9\u00cd"+
		"\u00cd\u00d1\u00d1\u00d3\u00d3\u00da\u00da\u00e1\u00e1\u00e9\u00e9\u00ed"+
		"\u00ed\u00f1\u00f1\u00f3\u00f3\u00fa\u00fa\u0010\u000009AZ__az\u00c1\u00c1"+
		"\u00c9\u00c9\u00cd\u00cd\u00d1\u00d1\u00d3\u00d3\u00da\u00da\u00e1\u00e1"+
		"\u00e9\u00e9\u00ed\u00ed\u00f1\u00f1\u00f3\u00f3\u00fa\u00fa\u0002\u0000"+
		"AZaz\u0003\u0000\t\n\r\r  d\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001b\u0001"+
		"\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007$\u0001\u0000"+
		"\u0000\u0000\t&\u0001\u0000\u0000\u0000\u000b.\u0001\u0000\u0000\u0000"+
		"\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000\u0011E\u0001"+
		"\u0000\u0000\u0000\u0013I\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000"+
		"\u0000\u0017S\u0001\u0000\u0000\u0000\u0019\u001a\u0007\u0000\u0000\u0000"+
		"\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0013\t\u0000\u001c"+
		"\u0004\u0001\u0000\u0000\u0000\u001d \u0003\u0007\u0003\u0000\u001e \u0003"+
		"\t\u0004\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000 \u0006\u0001\u0000\u0000\u0000!%\u0003\u000f\u0007\u0000"+
		"\"%\u0003\u0013\t\u0000#%\u0003\u0011\b\u0000$!\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\b\u0001\u0000\u0000"+
		"\u0000&\'\u0005-\u0000\u0000\'(\u0005-\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000),\u0003\u000b\u0005\u0000*+\u0005=\u0000\u0000+-\u0003\r\u0006"+
		"\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\n\u0001\u0000"+
		"\u0000\u0000.3\u0003\u0015\n\u0000/2\u0003\u0015\n\u000002\u0003\r\u0006"+
		"\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u000025\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004\f\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u00006:\u0003\u000f\u0007\u0000"+
		"7:\u0003\u0011\b\u00008:\u0003\u0013\t\u000096\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u000e\u0001\u0000"+
		"\u0000\u0000;?\u0005\"\u0000\u0000<>\b\u0001\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BC\u0005\"\u0000\u0000C\u0010\u0001\u0000\u0000\u0000DF\u0007\u0002\u0000"+
		"\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0012\u0001\u0000\u0000\u0000"+
		"IM\u0007\u0003\u0000\u0000JL\u0007\u0004\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000N\u0014\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PQ\u0007\u0005\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RT\u0007\u0006"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WX\u0006\u000b\u0000\u0000X\u0018\u0001\u0000\u0000\u0000\u000b\u0000"+
		"\u001f$,139?GMU\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}