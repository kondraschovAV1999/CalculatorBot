// Generated from java-escape by ANTLR 4.11.1
package com.petproject.calculatorbot.Service.calculator.antlr4;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class arithmeticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAREN=2, RPAREN=3, PLUS=4, MINUS=5, MUL=6, DIV=7, EQ=8, COMMA=9, 
		POINT=10, POW=11, PI=12, EULER=13, NAME=14, SCIENTIFIC_NUMBER=15, NEWLINE=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LPAREN", "RPAREN", "PLUS", "MINUS", "MUL", "DIV", "EQ", "COMMA", 
			"POINT", "POW", "PI", "EULER", "NAME", "VALID_ID_START", "VALID_ID_CHAR", 
			"SCIENTIFIC_NUMBER", "NUMBER", "E1", "E2", "SIGN", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", "','", 
			"'.'", "'^'", "'pi'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LPAREN", "RPAREN", "PLUS", "MINUS", "MUL", "DIV", "EQ", 
			"COMMA", "POINT", "POW", "PI", "EULER", "NAME", "SCIENTIFIC_NUMBER", 
			"NEWLINE", "WS"
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


	public arithmeticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "arithmetic.g4"; }

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
		"\u0004\u0000\u0011\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0005\rM\b\r\n\r\f\rP\t\r\u0001\u000e\u0003\u000eS\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0003\u000fW\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\\\b\u0010\u0001\u0010\u0003\u0010_\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010c\b\u0010\u0001\u0011\u0004\u0011f\b\u0011\u000b\u0011"+
		"\f\u0011g\u0001\u0011\u0001\u0011\u0004\u0011l\b\u0011\u000b\u0011\f\u0011"+
		"m\u0003\u0011p\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015y\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0004\u0016~\b\u0016\u000b\u0016\f\u0016\u007f"+
		"\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u0000\u001f\u0000!\u000f"+
		"#\u0000%\u0000\'\u0000)\u0000+\u0010-\u0011\u0001\u0000\u0003\u0003\u0000"+
		"AZ__az\u0002\u0000++--\u0002\u0000\t\t  \u0086\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001"+
		"\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000"+
		"\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b"+
		"9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f=\u0001\u0000"+
		"\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000"+
		"\u0015C\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019H"+
		"\u0001\u0000\u0000\u0000\u001bJ\u0001\u0000\u0000\u0000\u001dR\u0001\u0000"+
		"\u0000\u0000\u001fV\u0001\u0000\u0000\u0000!X\u0001\u0000\u0000\u0000"+
		"#e\u0001\u0000\u0000\u0000%q\u0001\u0000\u0000\u0000\'s\u0001\u0000\u0000"+
		"\u0000)u\u0001\u0000\u0000\u0000+x\u0001\u0000\u0000\u0000-}\u0001\u0000"+
		"\u0000\u0000/0\u0005;\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005"+
		"(\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005)\u0000\u00004\u0006"+
		"\u0001\u0000\u0000\u000056\u0005+\u0000\u00006\b\u0001\u0000\u0000\u0000"+
		"78\u0005-\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005*\u0000\u0000"+
		":\f\u0001\u0000\u0000\u0000;<\u0005/\u0000\u0000<\u000e\u0001\u0000\u0000"+
		"\u0000=>\u0005=\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005,\u0000"+
		"\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0005.\u0000\u0000B\u0014\u0001"+
		"\u0000\u0000\u0000CD\u0005^\u0000\u0000D\u0016\u0001\u0000\u0000\u0000"+
		"EF\u0005p\u0000\u0000FG\u0005i\u0000\u0000G\u0018\u0001\u0000\u0000\u0000"+
		"HI\u0003\'\u0013\u0000I\u001a\u0001\u0000\u0000\u0000JN\u0003\u001d\u000e"+
		"\u0000KM\u0003\u001f\u000f\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u001c"+
		"\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0007\u0000\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000S\u001e\u0001\u0000\u0000\u0000TW\u0003"+
		"\u001d\u000e\u0000UW\u000209\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000W \u0001\u0000\u0000\u0000Xb\u0003#\u0011\u0000Y\\\u0003%"+
		"\u0012\u0000Z\\\u0003\'\u0013\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]_\u0003)\u0014\u0000^]\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`a\u0003#\u0011\u0000ac\u0001\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\"\u0001\u0000\u0000\u0000df\u000209\u0000"+
		"ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000ho\u0001\u0000\u0000\u0000ik\u0005.\u0000"+
		"\u0000jl\u000209\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000"+
		"\u0000oi\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p$\u0001\u0000"+
		"\u0000\u0000qr\u0005E\u0000\u0000r&\u0001\u0000\u0000\u0000st\u0005e\u0000"+
		"\u0000t(\u0001\u0000\u0000\u0000uv\u0007\u0001\u0000\u0000v*\u0001\u0000"+
		"\u0000\u0000wy\u0005\r\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\n\u0000\u0000{,\u0001\u0000"+
		"\u0000\u0000|~\u0007\u0002\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0006"+
		"\u0016\u0000\u0000\u0082.\u0001\u0000\u0000\u0000\f\u0000NRV[^bgmox\u007f"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}