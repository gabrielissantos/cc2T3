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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, NOME=40, STRING=41, DATA=42, NUM_INT=43, NUM_REAL=44, URL=45;
	public static final int
		RULE_programa = 0, RULE_titulo = 1, RULE_data = 2, RULE_numConvidados = 3, 
		RULE_listaPadrinhos = 4, RULE_listaPresentes = 5, RULE_presente = 6, RULE_listaConvidados = 7, 
		RULE_listaServicos = 8, RULE_fotografo = 9, RULE_buffet = 10, RULE_cerimonial = 11, 
		RULE_local = 12, RULE_musica = 13, RULE_decoracao = 14, RULE_convites = 15, 
		RULE_lua_de_mel = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "titulo", "data", "numConvidados", "listaPadrinhos", "listaPresentes", 
			"presente", "listaConvidados", "listaServicos", "fotografo", "buffet", 
			"cerimonial", "local", "musica", "decoracao", "convites", "lua_de_mel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'casamento:'", "'data:'", "'numero_de_convidados:'", "'padrinhos:'", 
			"'presentes:'", "'convidados:'", "'servicos:'", "'casamento'", "':'", 
			"'data'", "'convidados'", "'['", "']'", "'{'", "','", "'}'", "'fotografo:'", 
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
			null, null, null, null, "NOME", "STRING", "DATA", "NUM_INT", "NUM_REAL", 
			"URL"
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
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public NumConvidadosContext numConvidados() {
			return getRuleContext(NumConvidadosContext.class,0);
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
			match(T__0);
			setState(35);
			titulo();
			setState(36);
			match(T__1);
			setState(37);
			data();
			setState(38);
			match(T__2);
			setState(39);
			numConvidados();
			setState(40);
			match(T__3);
			setState(41);
			listaPadrinhos();
			setState(42);
			match(T__4);
			setState(43);
			listaPresentes();
			setState(44);
			match(T__5);
			setState(45);
			listaConvidados();
			setState(46);
			match(T__6);
			setState(47);
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
			setState(49);
			match(T__7);
			setState(50);
			match(T__8);
			setState(51);
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
		enterRule(_localctx, 4, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__9);
			setState(54);
			match(T__8);
			setState(55);
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
		enterRule(_localctx, 6, RULE_numConvidados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__10);
			setState(58);
			match(T__8);
			setState(59);
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
			setState(61);
			match(T__11);
			setState(62);
			match(NOME);
			setState(63);
			match(T__8);
			setState(64);
			match(STRING);
			setState(65);
			match(T__12);
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
			setState(67);
			match(T__11);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(68);
				presente();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__12);
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
		public TerminalNode STRING() { return getToken(casamentoParser.STRING, 0); }
		public TerminalNode URL() { return getToken(casamentoParser.URL, 0); }
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
			setState(76);
			match(T__13);
			setState(77);
			((PresenteContext)_localctx).descricao = match(STRING);
			setState(78);
			match(T__14);
			setState(79);
			((PresenteContext)_localctx).url = match(URL);
			setState(80);
			match(T__14);
			setState(81);
			match(T__11);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOME) {
				{
				setState(82);
				match(NOME);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(83);
					match(T__14);
					setState(84);
					match(NOME);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			match(T__12);
			setState(93);
			match(T__15);
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
			setState(95);
			match(T__11);
			setState(96);
			match(STRING);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(97);
				match(T__14);
				setState(98);
				match(STRING);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__12);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__11);
				setState(107);
				match(T__16);
				setState(108);
				fotografo();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__17);
				setState(110);
				buffet();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__18);
				setState(112);
				cerimonial();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(T__19);
				setState(114);
				local();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(T__20);
				setState(116);
				musica();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(T__21);
				setState(118);
				decoracao();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(T__22);
				setState(120);
				convites();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(T__23);
				setState(122);
				lua_de_mel();
				setState(123);
				match(T__12);
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
			setState(127);
			match(T__13);
			setState(128);
			match(T__24);
			setState(129);
			match(STRING);
			setState(130);
			match(T__25);
			setState(131);
			match(NUM_INT);
			setState(132);
			match(T__26);
			setState(133);
			match(T__27);
			setState(134);
			match(NUM_REAL);
			setState(135);
			match(T__15);
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
			setState(137);
			match(T__13);
			setState(138);
			match(T__24);
			setState(139);
			match(STRING);
			setState(140);
			match(T__25);
			setState(141);
			match(NUM_INT);
			setState(142);
			match(T__26);
			setState(143);
			match(T__27);
			setState(144);
			match(NUM_REAL);
			setState(145);
			match(T__15);
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
			setState(147);
			match(T__13);
			setState(148);
			match(T__24);
			setState(149);
			match(STRING);
			setState(150);
			match(T__25);
			setState(151);
			match(NUM_INT);
			setState(152);
			match(T__26);
			setState(153);
			match(T__27);
			setState(154);
			match(NUM_REAL);
			setState(155);
			match(T__15);
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
			setState(157);
			match(T__13);
			setState(158);
			match(T__24);
			setState(159);
			match(STRING);
			setState(160);
			match(T__28);
			setState(161);
			match(STRING);
			setState(162);
			match(T__25);
			setState(163);
			match(NUM_INT);
			setState(164);
			match(T__26);
			setState(165);
			match(T__27);
			setState(166);
			match(NUM_REAL);
			setState(167);
			match(T__15);
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
			setState(169);
			match(T__13);
			setState(170);
			match(T__24);
			setState(171);
			match(STRING);
			setState(172);
			match(T__25);
			setState(173);
			match(NUM_INT);
			setState(174);
			match(T__26);
			setState(175);
			match(T__27);
			setState(176);
			match(NUM_REAL);
			setState(177);
			match(T__29);
			setState(178);
			match(STRING);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(179);
				match(T__14);
				setState(180);
				match(STRING);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__20);
			setState(187);
			match(STRING);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(188);
				match(T__14);
				setState(189);
				match(STRING);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__15);
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
			setState(197);
			match(T__13);
			setState(198);
			match(T__24);
			setState(199);
			match(STRING);
			setState(200);
			match(T__25);
			setState(201);
			match(NUM_INT);
			setState(202);
			match(T__26);
			setState(203);
			match(T__27);
			setState(204);
			match(NUM_REAL);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(205);
				match(T__30);
				setState(206);
				match(STRING);
				}
			}

			setState(209);
			match(T__15);
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
			setState(211);
			match(T__13);
			setState(212);
			match(T__24);
			setState(213);
			match(STRING);
			setState(214);
			match(T__25);
			setState(215);
			match(NUM_INT);
			setState(216);
			match(T__31);
			setState(217);
			match(NUM_INT);
			setState(218);
			match(T__32);
			setState(219);
			match(T__27);
			setState(220);
			match(NUM_REAL);
			setState(221);
			match(T__15);
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
			setState(223);
			match(T__13);
			setState(224);
			match(T__19);
			setState(225);
			match(STRING);
			setState(226);
			match(T__33);
			setState(227);
			match(STRING);
			setState(228);
			match(T__34);
			setState(229);
			match(NUM_INT);
			setState(230);
			match(T__35);
			setState(231);
			match(T__27);
			setState(232);
			match(NUM_REAL);
			setState(233);
			match(T__36);
			setState(234);
			match(DATA);
			setState(235);
			match(T__37);
			setState(236);
			match(DATA);
			setState(237);
			match(T__38);
			setState(238);
			match(T__27);
			setState(239);
			match(NUM_REAL);
			setState(240);
			match(T__15);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\7\7H\n\7\f\7\16\7K\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bX\n\b\f\b\16\b[\13\b\5\b]\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tf\n\t\f"+
		"\t\16\ti\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00b8\n\17\f\17\16\17\u00bb\13\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d2\n\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00f1"+
		"\2$\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b;\3\2\2\2\n?\3\2\2\2\fE\3\2\2\2"+
		"\16N\3\2\2\2\20a\3\2\2\2\22\177\3\2\2\2\24\u0081\3\2\2\2\26\u008b\3\2"+
		"\2\2\30\u0095\3\2\2\2\32\u009f\3\2\2\2\34\u00ab\3\2\2\2\36\u00c7\3\2\2"+
		"\2 \u00d5\3\2\2\2\"\u00e1\3\2\2\2$%\7\3\2\2%&\5\4\3\2&\'\7\4\2\2\'(\5"+
		"\6\4\2()\7\5\2\2)*\5\b\5\2*+\7\6\2\2+,\5\n\6\2,-\7\7\2\2-.\5\f\7\2./\7"+
		"\b\2\2/\60\5\20\t\2\60\61\7\t\2\2\61\62\5\22\n\2\62\3\3\2\2\2\63\64\7"+
		"\n\2\2\64\65\7\13\2\2\65\66\7+\2\2\66\5\3\2\2\2\678\7\f\2\289\7\13\2\2"+
		"9:\7,\2\2:\7\3\2\2\2;<\7\r\2\2<=\7\13\2\2=>\7-\2\2>\t\3\2\2\2?@\7\16\2"+
		"\2@A\7*\2\2AB\7\13\2\2BC\7+\2\2CD\7\17\2\2D\13\3\2\2\2EI\7\16\2\2FH\5"+
		"\16\b\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM"+
		"\7\17\2\2M\r\3\2\2\2NO\7\20\2\2OP\7+\2\2PQ\7\21\2\2QR\7/\2\2RS\7\21\2"+
		"\2S\\\7\16\2\2TY\7*\2\2UV\7\21\2\2VX\7*\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\T\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7"+
		"\17\2\2_`\7\22\2\2`\17\3\2\2\2ab\7\16\2\2bg\7+\2\2cd\7\21\2\2df\7+\2\2"+
		"ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\17\2"+
		"\2k\21\3\2\2\2lm\7\16\2\2mn\7\23\2\2n\u0080\5\24\13\2op\7\24\2\2p\u0080"+
		"\5\26\f\2qr\7\25\2\2r\u0080\5\30\r\2st\7\26\2\2t\u0080\5\32\16\2uv\7\27"+
		"\2\2v\u0080\5\34\17\2wx\7\30\2\2x\u0080\5\36\20\2yz\7\31\2\2z\u0080\5"+
		" \21\2{|\7\32\2\2|}\5\"\22\2}~\7\17\2\2~\u0080\3\2\2\2\177l\3\2\2\2\177"+
		"o\3\2\2\2\177q\3\2\2\2\177s\3\2\2\2\177u\3\2\2\2\177w\3\2\2\2\177y\3\2"+
		"\2\2\177{\3\2\2\2\u0080\23\3\2\2\2\u0081\u0082\7\20\2\2\u0082\u0083\7"+
		"\33\2\2\u0083\u0084\7+\2\2\u0084\u0085\7\34\2\2\u0085\u0086\7-\2\2\u0086"+
		"\u0087\7\35\2\2\u0087\u0088\7\36\2\2\u0088\u0089\7.\2\2\u0089\u008a\7"+
		"\22\2\2\u008a\25\3\2\2\2\u008b\u008c\7\20\2\2\u008c\u008d\7\33\2\2\u008d"+
		"\u008e\7+\2\2\u008e\u008f\7\34\2\2\u008f\u0090\7-\2\2\u0090\u0091\7\35"+
		"\2\2\u0091\u0092\7\36\2\2\u0092\u0093\7.\2\2\u0093\u0094\7\22\2\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\7\20\2\2\u0096\u0097\7\33\2\2\u0097\u0098\7+\2"+
		"\2\u0098\u0099\7\34\2\2\u0099\u009a\7-\2\2\u009a\u009b\7\35\2\2\u009b"+
		"\u009c\7\36\2\2\u009c\u009d\7.\2\2\u009d\u009e\7\22\2\2\u009e\31\3\2\2"+
		"\2\u009f\u00a0\7\20\2\2\u00a0\u00a1\7\33\2\2\u00a1\u00a2\7+\2\2\u00a2"+
		"\u00a3\7\37\2\2\u00a3\u00a4\7+\2\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\7"+
		"-\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\7\36\2\2\u00a8\u00a9\7.\2\2\u00a9"+
		"\u00aa\7\22\2\2\u00aa\33\3\2\2\2\u00ab\u00ac\7\20\2\2\u00ac\u00ad\7\33"+
		"\2\2\u00ad\u00ae\7+\2\2\u00ae\u00af\7\34\2\2\u00af\u00b0\7-\2\2\u00b0"+
		"\u00b1\7\35\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3\7.\2\2\u00b3\u00b4\7"+
		" \2\2\u00b4\u00b9\7+\2\2\u00b5\u00b6\7\21\2\2\u00b6\u00b8\7+\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\27\2\2\u00bd"+
		"\u00c2\7+\2\2\u00be\u00bf\7\21\2\2\u00bf\u00c1\7+\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6\35\3\2\2"+
		"\2\u00c7\u00c8\7\20\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\7+\2\2\u00ca"+
		"\u00cb\7\34\2\2\u00cb\u00cc\7-\2\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\7"+
		"\36\2\2\u00ce\u00d1\7.\2\2\u00cf\u00d0\7!\2\2\u00d0\u00d2\7+\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\22"+
		"\2\2\u00d4\37\3\2\2\2\u00d5\u00d6\7\20\2\2\u00d6\u00d7\7\33\2\2\u00d7"+
		"\u00d8\7+\2\2\u00d8\u00d9\7\34\2\2\u00d9\u00da\7-\2\2\u00da\u00db\7\""+
		"\2\2\u00db\u00dc\7-\2\2\u00dc\u00dd\7#\2\2\u00dd\u00de\7\36\2\2\u00de"+
		"\u00df\7.\2\2\u00df\u00e0\7\22\2\2\u00e0!\3\2\2\2\u00e1\u00e2\7\20\2\2"+
		"\u00e2\u00e3\7\26\2\2\u00e3\u00e4\7+\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6"+
		"\7+\2\2\u00e6\u00e7\7%\2\2\u00e7\u00e8\7-\2\2\u00e8\u00e9\7&\2\2\u00e9"+
		"\u00ea\7\36\2\2\u00ea\u00eb\7.\2\2\u00eb\u00ec\7\'\2\2\u00ec\u00ed\7,"+
		"\2\2\u00ed\u00ee\7(\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f0\7)\2\2\u00f0\u00f1"+
		"\7\36\2\2\u00f1\u00f2\7.\2\2\u00f2\u00f3\7\22\2\2\u00f3#\3\2\2\2\nIY\\"+
		"g\177\u00b9\u00c2\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}