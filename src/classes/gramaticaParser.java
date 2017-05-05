// Generated from gramatica.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, WS=2, PROCEDIMIENTO=3, IMPORTA=4, EXPORTA=5, VARIABLE=6, 
		CONSTANTE=7, ENTERA=8, REAL=9, LOGICA=10, CARACTERES=11, Y=12, SIGNOY=13, 
		O=14, SIGNOO=15, MENOR=16, SIGNOMENOR=17, MENORIGUAL=18, SIGNOMENORIGUAL=19, 
		MAYOR=20, SIGNOMAYOR=21, MAYORIGUAL=22, SIGNOMAYORIGUAL=23, IGUAL=24, 
		SIGNOIGUAL=25, DIFERENTE=26, SIGNODIFERENTE=27, SUMA=28, RESTA=29, MULTIPLICACION=30, 
		DIVISION=31, MODULO=32, POTENCIA=33, NO=34, IZQUIERDO=35, DERECHO=36, 
		ENTERO=37, NREAL=38, VERDADERO=39, FALSO=40, FRASE=41, PUNTO=42, AREGLO=43, 
		LONGITUD=44, CUADRADOI=45, CUADRADOD=46, PYC=47, SI=48, ES=49, DP=50, 
		SINO=51, OTROCASO=52, REPETIR=53, MIENTRAS=54, SEA=55, VECES=56, FIN=57, 
		IMPRIMIR=58, CAPTURAR=59, IDENTIFICADOR=60;
	public static final int
		RULE_programa = 0, RULE_declaraciones = 1, RULE_parametros = 2, RULE_exporta = 3, 
		RULE_listaParametros = 4, RULE_instrucciones = 5, RULE_nominacion = 6, 
		RULE_tipoVariable = 7, RULE_igualdad = 8, RULE_expresion = 9, RULE_operacionOY = 10, 
		RULE_comparacion = 11, RULE_opcomparacion = 12, RULE_aritmetica = 13, 
		RULE_multiplicacion = 14, RULE_potenciacion = 15, RULE_negacion = 16, 
		RULE_parentesis = 17, RULE_dato = 18, RULE_logico = 19, RULE_numero = 20, 
		RULE_listaArreglo = 21, RULE_listaCondicional = 22, RULE_ciclo = 23, RULE_listaImpresion = 24;
	public static final String[] ruleNames = {
		"programa", "declaraciones", "parametros", "exporta", "listaParametros", 
		"instrucciones", "nominacion", "tipoVariable", "igualdad", "expresion", 
		"operacionOY", "comparacion", "opcomparacion", "aritmetica", "multiplicacion", 
		"potenciacion", "negacion", "parentesis", "dato", "logico", "numero", 
		"listaArreglo", "listaCondicional", "ciclo", "listaImpresion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'/\\'", null, "'\\/'", null, "'<'", null, "'<='", null, "'>'", 
		null, "'>='", null, "'='", null, "'/='", "'+'", "'-'", "'*'", "'/'", null, 
		"'**'", null, "'('", "')'", null, null, null, null, null, "'.'", null, 
		null, "'['", "']'", "';'", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE_COMMENT", "WS", "PROCEDIMIENTO", "IMPORTA", "EXPORTA", "VARIABLE", 
		"CONSTANTE", "ENTERA", "REAL", "LOGICA", "CARACTERES", "Y", "SIGNOY", 
		"O", "SIGNOO", "MENOR", "SIGNOMENOR", "MENORIGUAL", "SIGNOMENORIGUAL", 
		"MAYOR", "SIGNOMAYOR", "MAYORIGUAL", "SIGNOMAYORIGUAL", "IGUAL", "SIGNOIGUAL", 
		"DIFERENTE", "SIGNODIFERENTE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
		"MODULO", "POTENCIA", "NO", "IZQUIERDO", "DERECHO", "ENTERO", "NREAL", 
		"VERDADERO", "FALSO", "FRASE", "PUNTO", "AREGLO", "LONGITUD", "CUADRADOI", 
		"CUADRADOD", "PYC", "SI", "ES", "DP", "SINO", "OTROCASO", "REPETIR", "MIENTRAS", 
		"SEA", "VECES", "FIN", "IMPRIMIR", "CAPTURAR", "IDENTIFICADOR"
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				declaraciones();
				setState(51);
				instrucciones();
				setState(52);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionesContext extends ParserRuleContext {
		public TerminalNode PROCEDIMIENTO() { return getToken(gramaticaParser.PROCEDIMIENTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode DP() { return getToken(gramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public TerminalNode PUNTO() { return getToken(gramaticaParser.PUNTO, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(PROCEDIMIENTO);
				setState(58);
				match(IDENTIFICADOR);
				setState(59);
				parametros();
				setState(60);
				match(DP);
				setState(61);
				instrucciones();
				setState(62);
				match(FIN);
				setState(63);
				match(PUNTO);
				setState(64);
				declaraciones();
				}
				break;
			case EOF:
			case VARIABLE:
			case CONSTANTE:
			case AREGLO:
			case SI:
			case REPETIR:
			case IMPRIMIR:
			case CAPTURAR:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode IMPORTA() { return getToken(gramaticaParser.IMPORTA, 0); }
		public TerminalNode VARIABLE() { return getToken(gramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ExportaContext exporta() {
			return getRuleContext(ExportaContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IMPORTA);
			setState(70);
			match(VARIABLE);
			setState(71);
			tipoVariable();
			setState(72);
			match(IDENTIFICADOR);
			setState(73);
			listaParametros();
			setState(74);
			exporta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportaContext extends ParserRuleContext {
		public TerminalNode EXPORTA() { return getToken(gramaticaParser.EXPORTA, 0); }
		public TerminalNode VARIABLE() { return getToken(gramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ExportaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exporta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExporta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExporta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExporta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportaContext exporta() throws RecognitionException {
		ExportaContext _localctx = new ExportaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exporta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(EXPORTA);
			setState(77);
			match(VARIABLE);
			setState(78);
			tipoVariable();
			setState(79);
			match(IDENTIFICADOR);
			setState(80);
			listaParametros();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaParametrosContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(gramaticaParser.PYC, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaParametros);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(PYC);
				setState(83);
				tipoVariable();
				setState(84);
				match(IDENTIFICADOR);
				setState(85);
				listaParametros();
				}
				break;
			case EXPORTA:
			case DP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public NominacionContext nominacion() {
			return getRuleContext(NominacionContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(gramaticaParser.PUNTO, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public TerminalNode AREGLO() { return getToken(gramaticaParser.AREGLO, 0); }
		public TerminalNode VARIABLE() { return getToken(gramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode LONGITUD() { return getToken(gramaticaParser.LONGITUD, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaArregloContext listaArreglo() {
			return getRuleContext(ListaArregloContext.class,0);
		}
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public TerminalNode CUADRADOI() { return getToken(gramaticaParser.CUADRADOI, 0); }
		public TerminalNode CUADRADOD() { return getToken(gramaticaParser.CUADRADOD, 0); }
		public TerminalNode SI() { return getToken(gramaticaParser.SI, 0); }
		public TerminalNode DP() { return getToken(gramaticaParser.DP, 0); }
		public ListaCondicionalContext listaCondicional() {
			return getRuleContext(ListaCondicionalContext.class,0);
		}
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public TerminalNode IMPRIMIR() { return getToken(gramaticaParser.IMPRIMIR, 0); }
		public ListaImpresionContext listaImpresion() {
			return getRuleContext(ListaImpresionContext.class,0);
		}
		public TerminalNode CAPTURAR() { return getToken(gramaticaParser.CAPTURAR, 0); }
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrucciones);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				nominacion();
				setState(91);
				match(PUNTO);
				setState(92);
				instrucciones();
				}
				break;
			case AREGLO:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(AREGLO);
				setState(95);
				match(VARIABLE);
				setState(96);
				tipoVariable();
				setState(97);
				match(IDENTIFICADOR);
				setState(98);
				match(LONGITUD);
				setState(99);
				expresion();
				setState(100);
				listaArreglo();
				setState(101);
				match(PUNTO);
				setState(102);
				instrucciones();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(IDENTIFICADOR);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CUADRADOI) {
					{
					setState(105);
					match(CUADRADOI);
					setState(106);
					expresion();
					setState(107);
					listaArreglo();
					setState(108);
					match(CUADRADOD);
					}
				}

				setState(112);
				igualdad();
				setState(113);
				match(PUNTO);
				setState(114);
				instrucciones();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(SI);
				setState(117);
				expresion();
				setState(118);
				match(DP);
				setState(119);
				instrucciones();
				setState(120);
				listaCondicional();
				setState(121);
				match(FIN);
				setState(122);
				match(PUNTO);
				setState(123);
				instrucciones();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				ciclo();
				setState(126);
				match(PUNTO);
				setState(127);
				instrucciones();
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(IMPRIMIR);
				setState(130);
				expresion();
				setState(131);
				listaImpresion();
				setState(132);
				match(PUNTO);
				setState(133);
				instrucciones();
				}
				break;
			case CAPTURAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				match(CAPTURAR);
				setState(136);
				match(IDENTIFICADOR);
				setState(137);
				match(PUNTO);
				setState(138);
				instrucciones();
				}
				break;
			case EOF:
			case SINO:
			case OTROCASO:
			case FIN:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NominacionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(gramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(gramaticaParser.CONSTANTE, 0); }
		public NominacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNominacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNominacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNominacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NominacionContext nominacion() throws RecognitionException {
		NominacionContext _localctx = new NominacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nominacion);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(VARIABLE);
				setState(143);
				tipoVariable();
				setState(144);
				match(IDENTIFICADOR);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL || _la==SIGNOIGUAL) {
					{
					setState(145);
					igualdad();
					}
				}

				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(CONSTANTE);
				setState(149);
				tipoVariable();
				setState(150);
				match(IDENTIFICADOR);
				setState(151);
				igualdad();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode ENTERA() { return getToken(gramaticaParser.ENTERA, 0); }
		public TerminalNode REAL() { return getToken(gramaticaParser.REAL, 0); }
		public TerminalNode LOGICA() { return getToken(gramaticaParser.LOGICA, 0); }
		public TerminalNode CARACTERES() { return getToken(gramaticaParser.CARACTERES, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipoVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTipoVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERA) | (1L << REAL) | (1L << LOGICA) | (1L << CARACTERES))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgualdadContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SIGNOIGUAL() { return getToken(gramaticaParser.SIGNOIGUAL, 0); }
		public IgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualdadContext igualdad() throws RecognitionException {
		IgualdadContext _localctx = new IgualdadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_igualdad);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(IGUAL);
				setState(158);
				expresion();
				}
				break;
			case SIGNOIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(SIGNOIGUAL);
				setState(160);
				expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public OperacionOYContext operacionOY() {
			return getRuleContext(OperacionOYContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			operacionOY(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionOYContext extends ParserRuleContext {
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public OperacionOYContext operacionOY() {
			return getRuleContext(OperacionOYContext.class,0);
		}
		public TerminalNode Y() { return getToken(gramaticaParser.Y, 0); }
		public TerminalNode SIGNOY() { return getToken(gramaticaParser.SIGNOY, 0); }
		public TerminalNode O() { return getToken(gramaticaParser.O, 0); }
		public TerminalNode SIGNOO() { return getToken(gramaticaParser.SIGNOO, 0); }
		public OperacionOYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionOY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperacionOY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperacionOY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperacionOY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionOYContext operacionOY() throws RecognitionException {
		return operacionOY(0);
	}

	private OperacionOYContext operacionOY(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionOYContext _localctx = new OperacionOYContext(_ctx, _parentState);
		OperacionOYContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_operacionOY, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			comparacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionOYContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionOY);
					setState(168);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(169);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Y) | (1L << SIGNOY) | (1L << O) | (1L << SIGNOO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(170);
					comparacion(0);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public AritmeticaContext aritmetica() {
			return getRuleContext(AritmeticaContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public OpcomparacionContext opcomparacion() {
			return getRuleContext(OpcomparacionContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		return comparacion(0);
	}

	private ComparacionContext comparacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparacionContext _localctx = new ComparacionContext(_ctx, _parentState);
		ComparacionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_comparacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			aritmetica(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparacion);
					setState(179);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(180);
					opcomparacion();
					setState(181);
					aritmetica(0);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpcomparacionContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(gramaticaParser.MENOR, 0); }
		public TerminalNode SIGNOMENOR() { return getToken(gramaticaParser.SIGNOMENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(gramaticaParser.MENORIGUAL, 0); }
		public TerminalNode SIGNOMENORIGUAL() { return getToken(gramaticaParser.SIGNOMENORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(gramaticaParser.MAYOR, 0); }
		public TerminalNode SIGNOMAYOR() { return getToken(gramaticaParser.SIGNOMAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(gramaticaParser.MAYORIGUAL, 0); }
		public TerminalNode SIGNOMAYORIGUAL() { return getToken(gramaticaParser.SIGNOMAYORIGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(gramaticaParser.DIFERENTE, 0); }
		public TerminalNode SIGNODIFERENTE() { return getToken(gramaticaParser.SIGNODIFERENTE, 0); }
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public TerminalNode SIGNOIGUAL() { return getToken(gramaticaParser.SIGNOIGUAL, 0); }
		public OpcomparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOpcomparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOpcomparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOpcomparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcomparacionContext opcomparacion() throws RecognitionException {
		OpcomparacionContext _localctx = new OpcomparacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opcomparacion);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
			case SIGNOMENOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==MENOR || _la==SIGNOMENOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MENORIGUAL:
			case SIGNOMENORIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==MENORIGUAL || _la==SIGNOMENORIGUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MAYOR:
			case SIGNOMAYOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==MAYOR || _la==SIGNOMAYOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MAYORIGUAL:
			case SIGNOMAYORIGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==MAYORIGUAL || _la==SIGNOMAYORIGUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DIFERENTE:
			case SIGNODIFERENTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==DIFERENTE || _la==SIGNODIFERENTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IGUAL:
			case SIGNOIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==IGUAL || _la==SIGNOIGUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AritmeticaContext extends ParserRuleContext {
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public AritmeticaContext aritmetica() {
			return getRuleContext(AritmeticaContext.class,0);
		}
		public TerminalNode SUMA() { return getToken(gramaticaParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(gramaticaParser.RESTA, 0); }
		public AritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmeticaContext aritmetica() throws RecognitionException {
		return aritmetica(0);
	}

	private AritmeticaContext aritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AritmeticaContext _localctx = new AritmeticaContext(_ctx, _parentState);
		AritmeticaContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_aritmetica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(197);
			multiplicacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_aritmetica);
					setState(199);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(200);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(201);
					multiplicacion(0);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicacionContext extends ParserRuleContext {
		public PotenciacionContext potenciacion() {
			return getRuleContext(PotenciacionContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public TerminalNode MULTIPLICACION() { return getToken(gramaticaParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(gramaticaParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(gramaticaParser.MODULO, 0); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		return multiplicacion(0);
	}

	private MultiplicacionContext multiplicacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, _parentState);
		MultiplicacionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_multiplicacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			potenciacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicacion);
					setState(210);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(211);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACION) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(212);
					potenciacion(0);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PotenciacionContext extends ParserRuleContext {
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public PotenciacionContext potenciacion() {
			return getRuleContext(PotenciacionContext.class,0);
		}
		public TerminalNode POTENCIA() { return getToken(gramaticaParser.POTENCIA, 0); }
		public PotenciacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenciacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPotenciacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPotenciacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPotenciacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciacionContext potenciacion() throws RecognitionException {
		return potenciacion(0);
	}

	private PotenciacionContext potenciacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PotenciacionContext _localctx = new PotenciacionContext(_ctx, _parentState);
		PotenciacionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_potenciacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			negacion();
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PotenciacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_potenciacion);
					setState(221);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(222);
					match(POTENCIA);
					setState(223);
					negacion();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NegacionContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(gramaticaParser.NO, 0); }
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public ParentesisContext parentesis() {
			return getRuleContext(ParentesisContext.class,0);
		}
		public NegacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNegacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_negacion);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(NO);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(230);
					negacion();
					}
					break;
				case 2:
					{
					setState(231);
					parentesis();
					}
					break;
				}
				}
				break;
			case IZQUIERDO:
			case ENTERO:
			case NREAL:
			case VERDADERO:
			case FALSO:
			case FRASE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				parentesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentesisContext extends ParserRuleContext {
		public TerminalNode IZQUIERDO() { return getToken(gramaticaParser.IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DERECHO() { return getToken(gramaticaParser.DERECHO, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public ParentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentesisContext parentesis() throws RecognitionException {
		ParentesisContext _localctx = new ParentesisContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parentesis);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(IZQUIERDO);
				setState(238);
				expresion();
				setState(239);
				match(DERECHO);
				}
				break;
			case ENTERO:
			case NREAL:
			case VERDADERO:
			case FALSO:
			case FRASE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				dato();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode CUADRADOI() { return getToken(gramaticaParser.CUADRADOI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaArregloContext listaArreglo() {
			return getRuleContext(ListaArregloContext.class,0);
		}
		public TerminalNode CUADRADOD() { return getToken(gramaticaParser.CUADRADOD, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode FRASE() { return getToken(gramaticaParser.FRASE, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dato);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(IDENTIFICADOR);
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(245);
					match(CUADRADOI);
					setState(246);
					expresion();
					setState(247);
					listaArreglo();
					setState(248);
					match(CUADRADOD);
					}
					break;
				}
				}
				break;
			case ENTERO:
			case NREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				numero();
				}
				break;
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				logico();
				}
				break;
			case FRASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(FRASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicoContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(gramaticaParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(gramaticaParser.FALSO, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==VERDADERO || _la==FALSO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(gramaticaParser.ENTERO, 0); }
		public TerminalNode NREAL() { return getToken(gramaticaParser.NREAL, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==NREAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaArregloContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(gramaticaParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaArregloContext listaArreglo() {
			return getRuleContext(ListaArregloContext.class,0);
		}
		public ListaArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArregloContext listaArreglo() throws RecognitionException {
		ListaArregloContext _localctx = new ListaArregloContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listaArreglo);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(PYC);
				setState(262);
				expresion();
				setState(263);
				listaArreglo();
				}
				break;
			case PUNTO:
			case CUADRADOD:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaCondicionalContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(gramaticaParser.SINO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DP() { return getToken(gramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ListaCondicionalContext listaCondicional() {
			return getRuleContext(ListaCondicionalContext.class,0);
		}
		public TerminalNode OTROCASO() { return getToken(gramaticaParser.OTROCASO, 0); }
		public ListaCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaCondicionalContext listaCondicional() throws RecognitionException {
		ListaCondicionalContext _localctx = new ListaCondicionalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listaCondicional);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(SINO);
				setState(269);
				expresion();
				setState(270);
				match(DP);
				setState(271);
				instrucciones();
				setState(272);
				listaCondicional();
				}
				break;
			case OTROCASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(OTROCASO);
				setState(275);
				match(DP);
				setState(276);
				instrucciones();
				}
				break;
			case FIN:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(gramaticaParser.REPETIR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode VECES() { return getToken(gramaticaParser.VECES, 0); }
		public TerminalNode DP() { return getToken(gramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public TerminalNode MIENTRAS() { return getToken(gramaticaParser.MIENTRAS, 0); }
		public TerminalNode SEA() { return getToken(gramaticaParser.SEA, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ciclo);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(REPETIR);
				setState(281);
				expresion();
				setState(282);
				match(VECES);
				setState(283);
				match(DP);
				setState(284);
				instrucciones();
				setState(285);
				match(FIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(REPETIR);
				setState(288);
				match(MIENTRAS);
				setState(289);
				expresion();
				setState(290);
				match(SEA);
				setState(291);
				logico();
				setState(292);
				match(DP);
				setState(293);
				instrucciones();
				setState(294);
				match(FIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaImpresionContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(gramaticaParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaImpresionContext listaImpresion() {
			return getRuleContext(ListaImpresionContext.class,0);
		}
		public ListaImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaImpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaImpresionContext listaImpresion() throws RecognitionException {
		ListaImpresionContext _localctx = new ListaImpresionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listaImpresion);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(PYC);
				setState(299);
				expresion();
				setState(300);
				listaImpresion();
				}
				break;
			case PUNTO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return operacionOY_sempred((OperacionOYContext)_localctx, predIndex);
		case 11:
			return comparacion_sempred((ComparacionContext)_localctx, predIndex);
		case 13:
			return aritmetica_sempred((AritmeticaContext)_localctx, predIndex);
		case 14:
			return multiplicacion_sempred((MultiplicacionContext)_localctx, predIndex);
		case 15:
			return potenciacion_sempred((PotenciacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacionOY_sempred(OperacionOYContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comparacion_sempred(ComparacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aritmetica_sempred(AritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicacion_sempred(MultiplicacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean potenciacion_sempred(PotenciacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7\3\b\3\b\3\b\3\b\5\b\u0095\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00a4"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00c5\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00cd\n\17\f\17\16\17\u00d0\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00d8\n\20\f\20\16\20\u00db\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u00e3\n\21\f\21\16\21\u00e6\13\21\3\22\3\22\3\22\5\22\u00eb\n\22"+
		"\3\22\5\22\u00ee\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00f5\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00fd\n\24\3\24\3\24\3\24\5\24\u0102\n\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u010d\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0119\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u012b\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0132\n\32\3\32\2\7\26\30\34"+
		"\36 \33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\16\3\2"+
		"\n\r\3\2\16\21\3\2\22\23\3\2\24\25\3\2\26\27\3\2\30\31\3\2\34\35\3\2\32"+
		"\33\3\2\36\37\3\2 \"\3\2)*\3\2\'(\u013e\29\3\2\2\2\4E\3\2\2\2\6G\3\2\2"+
		"\2\bN\3\2\2\2\nZ\3\2\2\2\f\u008e\3\2\2\2\16\u009b\3\2\2\2\20\u009d\3\2"+
		"\2\2\22\u00a3\3\2\2\2\24\u00a5\3\2\2\2\26\u00a7\3\2\2\2\30\u00b2\3\2\2"+
		"\2\32\u00c4\3\2\2\2\34\u00c6\3\2\2\2\36\u00d1\3\2\2\2 \u00dc\3\2\2\2\""+
		"\u00ed\3\2\2\2$\u00f4\3\2\2\2&\u0101\3\2\2\2(\u0103\3\2\2\2*\u0105\3\2"+
		"\2\2,\u010c\3\2\2\2.\u0118\3\2\2\2\60\u012a\3\2\2\2\62\u0131\3\2\2\2\64"+
		"\65\5\4\3\2\65\66\5\f\7\2\66\67\7\2\2\3\67:\3\2\2\28:\7\2\2\39\64\3\2"+
		"\2\298\3\2\2\2:\3\3\2\2\2;<\7\5\2\2<=\7>\2\2=>\5\6\4\2>?\7\64\2\2?@\5"+
		"\f\7\2@A\7;\2\2AB\7,\2\2BC\5\4\3\2CF\3\2\2\2DF\3\2\2\2E;\3\2\2\2ED\3\2"+
		"\2\2F\5\3\2\2\2GH\7\6\2\2HI\7\b\2\2IJ\5\20\t\2JK\7>\2\2KL\5\n\6\2LM\5"+
		"\b\5\2M\7\3\2\2\2NO\7\7\2\2OP\7\b\2\2PQ\5\20\t\2QR\7>\2\2RS\5\n\6\2S\t"+
		"\3\2\2\2TU\7\61\2\2UV\5\20\t\2VW\7>\2\2WX\5\n\6\2X[\3\2\2\2Y[\3\2\2\2"+
		"ZT\3\2\2\2ZY\3\2\2\2[\13\3\2\2\2\\]\5\16\b\2]^\7,\2\2^_\5\f\7\2_\u008f"+
		"\3\2\2\2`a\7-\2\2ab\7\b\2\2bc\5\20\t\2cd\7>\2\2de\7.\2\2ef\5\24\13\2f"+
		"g\5,\27\2gh\7,\2\2hi\5\f\7\2i\u008f\3\2\2\2jp\7>\2\2kl\7/\2\2lm\5\24\13"+
		"\2mn\5,\27\2no\7\60\2\2oq\3\2\2\2pk\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\5\22"+
		"\n\2st\7,\2\2tu\5\f\7\2u\u008f\3\2\2\2vw\7\62\2\2wx\5\24\13\2xy\7\64\2"+
		"\2yz\5\f\7\2z{\5.\30\2{|\7;\2\2|}\7,\2\2}~\5\f\7\2~\u008f\3\2\2\2\177"+
		"\u0080\5\60\31\2\u0080\u0081\7,\2\2\u0081\u0082\5\f\7\2\u0082\u008f\3"+
		"\2\2\2\u0083\u0084\7<\2\2\u0084\u0085\5\24\13\2\u0085\u0086\5\62\32\2"+
		"\u0086\u0087\7,\2\2\u0087\u0088\5\f\7\2\u0088\u008f\3\2\2\2\u0089\u008a"+
		"\7=\2\2\u008a\u008b\7>\2\2\u008b\u008c\7,\2\2\u008c\u008f\5\f\7\2\u008d"+
		"\u008f\3\2\2\2\u008e\\\3\2\2\2\u008e`\3\2\2\2\u008ej\3\2\2\2\u008ev\3"+
		"\2\2\2\u008e\177\3\2\2\2\u008e\u0083\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\r\3\2\2\2\u0090\u0091\7\b\2\2\u0091\u0092\5\20\t"+
		"\2\u0092\u0094\7>\2\2\u0093\u0095\5\22\n\2\u0094\u0093\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u009c\3\2\2\2\u0096\u0097\7\t\2\2\u0097\u0098\5\20\t\2"+
		"\u0098\u0099\7>\2\2\u0099\u009a\5\22\n\2\u009a\u009c\3\2\2\2\u009b\u0090"+
		"\3\2\2\2\u009b\u0096\3\2\2\2\u009c\17\3\2\2\2\u009d\u009e\t\2\2\2\u009e"+
		"\21\3\2\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a4\5\24\13\2\u00a1\u00a2\7\33"+
		"\2\2\u00a2\u00a4\5\24\13\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\23\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6\25\3\2\2\2\u00a7\u00a8\b\f\1\2"+
		"\u00a8\u00a9\5\30\r\2\u00a9\u00af\3\2\2\2\u00aa\u00ab\f\4\2\2\u00ab\u00ac"+
		"\t\3\2\2\u00ac\u00ae\5\30\r\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b3\b\r\1\2\u00b3\u00b4\5\34\17\2\u00b4\u00bb\3\2\2\2"+
		"\u00b5\u00b6\f\4\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\5\34\17\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c5"+
		"\t\4\2\2\u00bf\u00c5\t\5\2\2\u00c0\u00c5\t\6\2\2\u00c1\u00c5\t\7\2\2\u00c2"+
		"\u00c5\t\b\2\2\u00c3\u00c5\t\t\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00c7\b\17\1\2\u00c7\u00c8\5\36"+
		"\20\2\u00c8\u00ce\3\2\2\2\u00c9\u00ca\f\4\2\2\u00ca\u00cb\t\n\2\2\u00cb"+
		"\u00cd\5\36\20\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\b\20\1\2\u00d2\u00d3\5 \21\2\u00d3\u00d9\3\2\2\2\u00d4\u00d5\f"+
		"\4\2\2\u00d5\u00d6\t\13\2\2\u00d6\u00d8\5 \21\2\u00d7\u00d4\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\37\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\b\21\1\2\u00dd\u00de\5\"\22\2\u00de"+
		"\u00e4\3\2\2\2\u00df\u00e0\f\4\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e3\5\""+
		"\22\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5!\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\7$\2\2\u00e8"+
		"\u00eb\5\"\22\2\u00e9\u00eb\5$\23\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3"+
		"\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\5$\23\2\u00ed\u00e7\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7%\2\2\u00f0\u00f1\5\24\13\2"+
		"\u00f1\u00f2\7&\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f5\5&\24\2\u00f4\u00ef"+
		"\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5%\3\2\2\2\u00f6\u00fc\7>\2\2\u00f7\u00f8"+
		"\7/\2\2\u00f8\u00f9\5\24\13\2\u00f9\u00fa\5,\27\2\u00fa\u00fb\7\60\2\2"+
		"\u00fb\u00fd\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0102"+
		"\3\2\2\2\u00fe\u0102\5*\26\2\u00ff\u0102\5(\25\2\u0100\u0102\7+\2\2\u0101"+
		"\u00f6\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\'\3\2\2\2\u0103\u0104\t\f\2\2\u0104)\3\2\2\2\u0105\u0106\t"+
		"\r\2\2\u0106+\3\2\2\2\u0107\u0108\7\61\2\2\u0108\u0109\5\24\13\2\u0109"+
		"\u010a\5,\27\2\u010a\u010d\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u0107\3\2"+
		"\2\2\u010c\u010b\3\2\2\2\u010d-\3\2\2\2\u010e\u010f\7\65\2\2\u010f\u0110"+
		"\5\24\13\2\u0110\u0111\7\64\2\2\u0111\u0112\5\f\7\2\u0112\u0113\5.\30"+
		"\2\u0113\u0119\3\2\2\2\u0114\u0115\7\66\2\2\u0115\u0116\7\64\2\2\u0116"+
		"\u0119\5\f\7\2\u0117\u0119\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u0114\3\2"+
		"\2\2\u0118\u0117\3\2\2\2\u0119/\3\2\2\2\u011a\u011b\7\67\2\2\u011b\u011c"+
		"\5\24\13\2\u011c\u011d\7:\2\2\u011d\u011e\7\64\2\2\u011e\u011f\5\f\7\2"+
		"\u011f\u0120\7;\2\2\u0120\u012b\3\2\2\2\u0121\u0122\7\67\2\2\u0122\u0123"+
		"\78\2\2\u0123\u0124\5\24\13\2\u0124\u0125\79\2\2\u0125\u0126\5(\25\2\u0126"+
		"\u0127\7\64\2\2\u0127\u0128\5\f\7\2\u0128\u0129\7;\2\2\u0129\u012b\3\2"+
		"\2\2\u012a\u011a\3\2\2\2\u012a\u0121\3\2\2\2\u012b\61\3\2\2\2\u012c\u012d"+
		"\7\61\2\2\u012d\u012e\5\24\13\2\u012e\u012f\5\62\32\2\u012f\u0132\3\2"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\63\3\2\2\2\319EZp\u008e\u0094\u009b\u00a3\u00af\u00bb\u00c4\u00ce\u00d9"+
		"\u00e4\u00ea\u00ed\u00f4\u00fc\u0101\u010c\u0118\u012a\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}