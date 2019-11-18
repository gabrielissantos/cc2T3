// Generated from C:\T3\cc2T3\T3CC2\src\t3cc2\casamento.g4 by ANTLR 4.7.2
package t3cc2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class casamentoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, NOME=36, STRING=37, DATA=38, NUM_INT=39, 
		NUM_REAL=40, WS=41;
	public static final int
		RULE_programa = 0, RULE_titulo = 1, RULE_numConvidados = 2, RULE_data = 3, 
		RULE_listaPadrinhos = 4, RULE_listaPresentes = 5, RULE_presente = 6, RULE_listaConvidados = 7, 
		RULE_listaServicos = 8, RULE_fotografo = 9, RULE_buffet = 10, RULE_cerimonial = 11, 
		RULE_local = 12, RULE_musica = 13, RULE_decoracao = 14, RULE_convites = 15, 
		RULE_lua_de_mel = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "titulo", "numConvidados", "data", "listaPadrinhos", "listaPresentes", 
			"presente", "listaConvidados", "listaServicos", "fotografo", "buffet", 
			"cerimonial", "local", "musica", "decoracao", "convites", "lua_de_mel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'casamento:'", "'convidados:'", "'data:'", "'padrinhos:'", "'['", 
			"':'", "']'", "'presentes:'", "'{'", "','", "'}'", "'servicos:'", "'fotografo:'", 
			"'buffet:'", "'cerimonial:'", "'local:'", "'musica:'", "'decoracao:'", 
			"'convites:'", "'lua_de_mel:'", "'nome:'", "'contato:'", "'preco:'", 
			"'R$'", "'endereco:'", "'instrumento:'", "'itens_decoracao:'", "'quantidade_convites:'", 
			"'preco_unidade:'", "'hospedagem:'", "'contato_hospedagem:'", "'preco_total:'", 
			"'data_ida:'", "'data_volta:'", "'valor_passagem:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NOME", "STRING", "DATA", "NUM_INT", "NUM_REAL", "WS"
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

	@Override
	public String getGrammarFileName() { return "casamento.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public casamentoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public NumConvidadosContext numConvidados() {
			return getRuleContext(NumConvidadosContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ListaPadrinhosContext listaPadrinhos() {
			return getRuleContext(ListaPadrinhosContext.class,0);
		}
		public ListaPresentesContext listaPresentes() {
			return getRuleContext(ListaPresentesContext.class,0);
		}
		public ListaConvidadosContext listaConvidados() {
			return getRuleContext(ListaConvidadosContext.class,0);
		}
		public ListaServicosContext listaServicos() {
			return getRuleContext(ListaServicosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			titulo();
			setState(35);
			numConvidados();
			setState(36);
			data();
			setState(37);
			listaPadrinhos();
			setState(38);
			listaPresentes();
			setState(39);
			listaConvidados();
			setState(40);
			listaServicos();
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

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(casamentoParser.STRING, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(STRING);
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

	public static class NumConvidadosContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(casamentoParser.NUM_INT, 0); }
		public NumConvidadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numConvidados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterNumConvidados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitNumConvidados(this);
		}
	}

	public final NumConvidadosContext numConvidados() throws RecognitionException {
		NumConvidadosContext _localctx = new NumConvidadosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numConvidados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			match(NUM_INT);
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(casamentoParser.DATA, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitData(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
			setState(49);
			match(DATA);
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

	public static class ListaPadrinhosContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(casamentoParser.NOME, 0); }
		public TerminalNode STRING() { return getToken(casamentoParser.STRING, 0); }
		public ListaPadrinhosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPadrinhos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterListaPadrinhos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitListaPadrinhos(this);
		}
	}

	public final ListaPadrinhosContext listaPadrinhos() throws RecognitionException {
		ListaPadrinhosContext _localctx = new ListaPadrinhosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaPadrinhos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__3);
			setState(52);
			match(T__4);
			setState(53);
			match(NOME);
			setState(54);
			match(T__5);
			setState(55);
			match(STRING);
			setState(56);
			match(T__6);
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

	public static class ListaPresentesContext extends ParserRuleContext {
		public List<PresenteContext> presente() {
			return getRuleContexts(PresenteContext.class);
		}
		public PresenteContext presente(int i) {
			return getRuleContext(PresenteContext.class,i);
		}
		public ListaPresentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPresentes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterListaPresentes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitListaPresentes(this);
		}
	}

	public final ListaPresentesContext listaPresentes() throws RecognitionException {
		ListaPresentesContext _localctx = new ListaPresentesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaPresentes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__7);
			setState(59);
			match(T__4);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(60);
				presente();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__6);
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

	public static class PresenteContext extends ParserRuleContext {
		public Token descricao;
		public Token url;
		public List<TerminalNode> STRING() { return getTokens(casamentoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(casamentoParser.STRING, i);
		}
		public List<TerminalNode> NOME() { return getTokens(casamentoParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(casamentoParser.NOME, i);
		}
		public PresenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_presente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterPresente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitPresente(this);
		}
	}

	public final PresenteContext presente() throws RecognitionException {
		PresenteContext _localctx = new PresenteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_presente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__8);
			setState(69);
			((PresenteContext)_localctx).descricao = match(STRING);
			setState(70);
			match(T__9);
			setState(71);
			((PresenteContext)_localctx).url = match(STRING);
			setState(72);
			match(T__9);
			setState(73);
			match(T__4);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOME) {
				{
				setState(74);
				match(NOME);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(75);
					match(T__9);
					setState(76);
					match(NOME);
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(84);
			match(T__6);
			setState(85);
			match(T__10);
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

	public static class ListaConvidadosContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(casamentoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(casamentoParser.STRING, i);
		}
		public ListaConvidadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaConvidados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterListaConvidados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitListaConvidados(this);
		}
	}

	public final ListaConvidadosContext listaConvidados() throws RecognitionException {
		ListaConvidadosContext _localctx = new ListaConvidadosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaConvidados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__1);
			setState(88);
			match(T__4);
			setState(89);
			match(STRING);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(90);
				match(T__9);
				setState(91);
				match(STRING);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T__6);
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

	public static class ListaServicosContext extends ParserRuleContext {
		public FotografoContext fotografo() {
			return getRuleContext(FotografoContext.class,0);
		}
		public BuffetContext buffet() {
			return getRuleContext(BuffetContext.class,0);
		}
		public CerimonialContext cerimonial() {
			return getRuleContext(CerimonialContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public MusicaContext musica() {
			return getRuleContext(MusicaContext.class,0);
		}
		public DecoracaoContext decoracao() {
			return getRuleContext(DecoracaoContext.class,0);
		}
		public ConvitesContext convites() {
			return getRuleContext(ConvitesContext.class,0);
		}
		public Lua_de_melContext lua_de_mel() {
			return getRuleContext(Lua_de_melContext.class,0);
		}
		public ListaServicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaServicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterListaServicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitListaServicos(this);
		}
	}

	public final ListaServicosContext listaServicos() throws RecognitionException {
		ListaServicosContext _localctx = new ListaServicosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaServicos);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__11);
				setState(100);
				match(T__4);
				setState(101);
				match(T__12);
				setState(102);
				fotografo();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__13);
				setState(104);
				buffet();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__14);
				setState(106);
				cerimonial();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(T__15);
				setState(108);
				local();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__16);
				setState(110);
				musica();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(T__17);
				setState(112);
				decoracao();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				match(T__18);
				setState(114);
				convites();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				match(T__19);
				setState(116);
				lua_de_mel();
				setState(117);
				match(T__6);
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

	public static class FotografoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(casamentoParser.STRING, 0); }
		public TerminalNode NUM_INT() { return getToken(casamentoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(casamentoParser.NUM_REAL, 0); }
		public FotografoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fotografo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterFotografo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitFotografo(this);
		}
	}

	public final FotografoContext fotografo() throws RecognitionException {
		FotografoContext _localctx = new FotografoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fotografo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__8);
			setState(122);
			match(T__20);
			setState(123);
			match(STRING);
			setState(124);
			match(T__21);
			setState(125);
			match(NUM_INT);
			setState(126);
			match(T__22);
			setState(127);
			match(T__23);
			setState(128);
			match(NUM_REAL);
			setState(129);
			match(T__10);
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

	public static class BuffetContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(casamentoParser.STRING, 0); }
		public TerminalNode NUM_INT() { return getToken(casamentoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(casamentoParser.NUM_REAL, 0); }
		public BuffetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buffet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterBuffet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitBuffet(this);
		}
	}

	public final BuffetContext buffet() throws RecognitionException {
		BuffetContext _localctx = new BuffetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_buffet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__8);
			setState(132);
			match(T__20);
			setState(133);
			match(STRING);
			setState(134);
			match(T__21);
			setState(135);
			match(NUM_INT);
			setState(136);
			match(T__22);
			setState(137);
			match(T__23);
			setState(138);
			match(NUM_REAL);
			setState(139);
			match(T__10);
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

	public static class CerimonialContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(casamentoParser.STRING, 0); }
		public TerminalNode NUM_INT() { return getToken(casamentoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(casamentoParser.NUM_REAL, 0); }
		public CerimonialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cerimonial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterCerimonial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitCerimonial(this);
		}
	}

	public final CerimonialContext cerimonial() throws RecognitionException {
		CerimonialContext _localctx = new CerimonialContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cerimonial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__8);
			setState(142);
			match(T__20);
			setState(143);
			match(STRING);
			setState(144);
			match(T__21);
			setState(145);
			match(NUM_INT);
			setState(146);
			match(T__22);
			setState(147);
			match(T__23);
			setState(148);
			match(NUM_REAL);
			setState(149);
			match(T__10);
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

	public static class LocalContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(casamentoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(casamentoParser.STRING, i);
		}
		public TerminalNode NUM_INT() { return getToken(casamentoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(casamentoParser.NUM_REAL, 0); }
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitLocal(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__8);
			setState(152);
			match(T__20);
			setState(153);
			match(STRING);
			setState(154);
			match(T__24);
			setState(155);
			match(STRING);
			setState(156);
			match(T__21);
			setState(157);
			match(NUM_INT);
			setState(158);
			match(T__22);
			setState(159);
			match(T__23);
			setState(160);
			match(NUM_REAL);
			setState(161);
			match(T__10);
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

	public static class MusicaContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(casamentoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(casamentoParser.STRING, i);
		}
		public TerminalNode NUM_INT() { return getToken(casamentoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(casamentoParser.NUM_REAL, 0); }
		public MusicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterMusica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitMusica(this);
		}
	}

	public final MusicaContext musica() throws RecognitionException {
		MusicaContext _localctx = new MusicaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_musica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__8);
			setState(164);
			match(T__20);
			setState(165);
			match(STRING);
			setState(166);
			match(T__21);
			setState(167);
			match(NUM_INT);
			setState(168);
			match(T__22);
			setState(169);
			match(T__23);
			setState(170);
			match(NUM_REAL);
			setState(171);
			match(T__25);
			setState(172);
			match(STRING);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(173);
				match(T__9);
				setState(174);
				match(STRING);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(T__16);
			setState(181);
			match(STRING);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(182);
				match(T__9);
				setState(183);
				match(STRING);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(T__10);
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

	public static class DecoracaoContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(casamentoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(casamentoParser.STRING, i);
		}
		public TerminalNode NUM_INT() { return getToken(casamentoParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(casamentoParser.NUM_REAL, 0); }
		public DecoracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterDecoracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitDecoracao(this);
		}
	}

	public final DecoracaoContext decoracao() throws RecognitionException {
		DecoracaoContext _localctx = new DecoracaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decoracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__8);
			setState(192);
			match(T__20);
			setState(193);
			match(STRING);
			setState(194);
			match(T__21);
			setState(195);
			match(NUM_INT);
			setState(196);
			match(T__22);
			setState(197);
			match(T__23);
			setState(198);
			match(NUM_REAL);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(199);
				match(T__26);
				setState(200);
				match(STRING);
				}
			}

			setState(203);
			match(T__10);
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

	public static class ConvitesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(casamentoParser.STRING, 0); }
		public List<TerminalNode> NUM_INT() { return getTokens(casamentoParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(casamentoParser.NUM_INT, i);
		}
		public TerminalNode NUM_REAL() { return getToken(casamentoParser.NUM_REAL, 0); }
		public ConvitesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convites; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterConvites(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitConvites(this);
		}
	}

	public final ConvitesContext convites() throws RecognitionException {
		ConvitesContext _localctx = new ConvitesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_convites);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__8);
			setState(206);
			match(T__20);
			setState(207);
			match(STRING);
			setState(208);
			match(T__21);
			setState(209);
			match(NUM_INT);
			setState(210);
			match(T__27);
			setState(211);
			match(NUM_INT);
			setState(212);
			match(T__28);
			setState(213);
			match(T__23);
			setState(214);
			match(NUM_REAL);
			setState(215);
			match(T__10);
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

	public static class Lua_de_melContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(casamentoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(casamentoParser.STRING, i);
		}
		public TerminalNode NUM_INT() { return getToken(casamentoParser.NUM_INT, 0); }
		public List<TerminalNode> NUM_REAL() { return getTokens(casamentoParser.NUM_REAL); }
		public TerminalNode NUM_REAL(int i) {
			return getToken(casamentoParser.NUM_REAL, i);
		}
		public List<TerminalNode> DATA() { return getTokens(casamentoParser.DATA); }
		public TerminalNode DATA(int i) {
			return getToken(casamentoParser.DATA, i);
		}
		public Lua_de_melContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lua_de_mel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).enterLua_de_mel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof casamentoListener ) ((casamentoListener)listener).exitLua_de_mel(this);
		}
	}

	public final Lua_de_melContext lua_de_mel() throws RecognitionException {
		Lua_de_melContext _localctx = new Lua_de_melContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lua_de_mel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__8);
			setState(218);
			match(T__15);
			setState(219);
			match(STRING);
			setState(220);
			match(T__29);
			setState(221);
			match(STRING);
			setState(222);
			match(T__30);
			setState(223);
			match(NUM_INT);
			setState(224);
			match(T__31);
			setState(225);
			match(T__23);
			setState(226);
			match(NUM_REAL);
			setState(227);
			match(T__32);
			setState(228);
			match(DATA);
			setState(229);
			match(T__33);
			setState(230);
			match(DATA);
			setState(231);
			match(T__34);
			setState(232);
			match(T__23);
			setState(233);
			match(NUM_REAL);
			setState(234);
			match(T__10);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7@\n\7\f\7\16\7C\13\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\bS\13\b\5\bU\n\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\nz\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b2\n\17"+
		"\f\17\16\17\u00b5\13\17\3\17\3\17\3\17\3\17\7\17\u00bb\n\17\f\17\16\17"+
		"\u00be\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00cc\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00eb\2$\3\2\2\2\4,\3\2\2\2\6/\3"+
		"\2\2\2\b\62\3\2\2\2\n\65\3\2\2\2\f<\3\2\2\2\16F\3\2\2\2\20Y\3\2\2\2\22"+
		"y\3\2\2\2\24{\3\2\2\2\26\u0085\3\2\2\2\30\u008f\3\2\2\2\32\u0099\3\2\2"+
		"\2\34\u00a5\3\2\2\2\36\u00c1\3\2\2\2 \u00cf\3\2\2\2\"\u00db\3\2\2\2$%"+
		"\5\4\3\2%&\5\6\4\2&\'\5\b\5\2\'(\5\n\6\2()\5\f\7\2)*\5\20\t\2*+\5\22\n"+
		"\2+\3\3\2\2\2,-\7\3\2\2-.\7\'\2\2.\5\3\2\2\2/\60\7\4\2\2\60\61\7)\2\2"+
		"\61\7\3\2\2\2\62\63\7\5\2\2\63\64\7(\2\2\64\t\3\2\2\2\65\66\7\6\2\2\66"+
		"\67\7\7\2\2\678\7&\2\289\7\b\2\29:\7\'\2\2:;\7\t\2\2;\13\3\2\2\2<=\7\n"+
		"\2\2=A\7\7\2\2>@\5\16\b\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3"+
		"\2\2\2CA\3\2\2\2DE\7\t\2\2E\r\3\2\2\2FG\7\13\2\2GH\7\'\2\2HI\7\f\2\2I"+
		"J\7\'\2\2JK\7\f\2\2KT\7\7\2\2LQ\7&\2\2MN\7\f\2\2NP\7&\2\2OM\3\2\2\2PS"+
		"\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2\2\2TU\3\2\2\2U"+
		"V\3\2\2\2VW\7\t\2\2WX\7\r\2\2X\17\3\2\2\2YZ\7\4\2\2Z[\7\7\2\2[`\7\'\2"+
		"\2\\]\7\f\2\2]_\7\'\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2"+
		"\2\2b`\3\2\2\2cd\7\t\2\2d\21\3\2\2\2ef\7\16\2\2fg\7\7\2\2gh\7\17\2\2h"+
		"z\5\24\13\2ij\7\20\2\2jz\5\26\f\2kl\7\21\2\2lz\5\30\r\2mn\7\22\2\2nz\5"+
		"\32\16\2op\7\23\2\2pz\5\34\17\2qr\7\24\2\2rz\5\36\20\2st\7\25\2\2tz\5"+
		" \21\2uv\7\26\2\2vw\5\"\22\2wx\7\t\2\2xz\3\2\2\2ye\3\2\2\2yi\3\2\2\2y"+
		"k\3\2\2\2ym\3\2\2\2yo\3\2\2\2yq\3\2\2\2ys\3\2\2\2yu\3\2\2\2z\23\3\2\2"+
		"\2{|\7\13\2\2|}\7\27\2\2}~\7\'\2\2~\177\7\30\2\2\177\u0080\7)\2\2\u0080"+
		"\u0081\7\31\2\2\u0081\u0082\7\32\2\2\u0082\u0083\7*\2\2\u0083\u0084\7"+
		"\r\2\2\u0084\25\3\2\2\2\u0085\u0086\7\13\2\2\u0086\u0087\7\27\2\2\u0087"+
		"\u0088\7\'\2\2\u0088\u0089\7\30\2\2\u0089\u008a\7)\2\2\u008a\u008b\7\31"+
		"\2\2\u008b\u008c\7\32\2\2\u008c\u008d\7*\2\2\u008d\u008e\7\r\2\2\u008e"+
		"\27\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0091\7\27\2\2\u0091\u0092\7\'"+
		"\2\2\u0092\u0093\7\30\2\2\u0093\u0094\7)\2\2\u0094\u0095\7\31\2\2\u0095"+
		"\u0096\7\32\2\2\u0096\u0097\7*\2\2\u0097\u0098\7\r\2\2\u0098\31\3\2\2"+
		"\2\u0099\u009a\7\13\2\2\u009a\u009b\7\27\2\2\u009b\u009c\7\'\2\2\u009c"+
		"\u009d\7\33\2\2\u009d\u009e\7\'\2\2\u009e\u009f\7\30\2\2\u009f\u00a0\7"+
		")\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00a3\7*\2\2\u00a3"+
		"\u00a4\7\r\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7\7\27"+
		"\2\2\u00a7\u00a8\7\'\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\7)\2\2\u00aa"+
		"\u00ab\7\31\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\7"+
		"\34\2\2\u00ae\u00b3\7\'\2\2\u00af\u00b0\7\f\2\2\u00b0\u00b2\7\'\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\23\2\2\u00b7"+
		"\u00bc\7\'\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00bb\7\'\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\r\2\2\u00c0\35\3\2\2"+
		"\2\u00c1\u00c2\7\13\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00c4\7\'\2\2\u00c4"+
		"\u00c5\7\30\2\2\u00c5\u00c6\7)\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\7"+
		"\32\2\2\u00c8\u00cb\7*\2\2\u00c9\u00ca\7\35\2\2\u00ca\u00cc\7\'\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\r"+
		"\2\2\u00ce\37\3\2\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d1\7\27\2\2\u00d1"+
		"\u00d2\7\'\2\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4\7)\2\2\u00d4\u00d5\7\36"+
		"\2\2\u00d5\u00d6\7)\2\2\u00d6\u00d7\7\37\2\2\u00d7\u00d8\7\32\2\2\u00d8"+
		"\u00d9\7*\2\2\u00d9\u00da\7\r\2\2\u00da!\3\2\2\2\u00db\u00dc\7\13\2\2"+
		"\u00dc\u00dd\7\22\2\2\u00dd\u00de\7\'\2\2\u00de\u00df\7 \2\2\u00df\u00e0"+
		"\7\'\2\2\u00e0\u00e1\7!\2\2\u00e1\u00e2\7)\2\2\u00e2\u00e3\7\"\2\2\u00e3"+
		"\u00e4\7\32\2\2\u00e4\u00e5\7*\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7\7(\2"+
		"\2\u00e7\u00e8\7$\2\2\u00e8\u00e9\7(\2\2\u00e9\u00ea\7%\2\2\u00ea\u00eb"+
		"\7\32\2\2\u00eb\u00ec\7*\2\2\u00ec\u00ed\7\r\2\2\u00ed#\3\2\2\2\nAQT`"+
		"y\u00b3\u00bc\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}