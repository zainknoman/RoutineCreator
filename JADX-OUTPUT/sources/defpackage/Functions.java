package defpackage;

/* JADX INFO: loaded from: GUIFormExamples.jar:Functions.class */
public class Functions {
    public final String[] aFun = {"ReadSeq", "Readlist", "Fread", "Fwrite", "WriteFile", "Locate", "GetLocalRef", "FindStr", "CallCDD", "SubString", "Trim", "CallCDT", "Convert", "Change"};
    public final String[] ReadSeq = {" Y.FILE.DIR  = ''", " FILE.NAME.1 = ''", " OPENSEQ Y.FILE.DIR,FILE.NAME.1 TO Y.FILE.POINTER LOCKED LOCK.ERR = 1 THEN OPEN.ERR =0 ELSE OPEN.ERR = 1", " IF OPEN.ERR THEN", " CRT \"FILE \" : FILE.NAME.1 : \" DOES NOT EXIST\"", " RETURN", " END", " ELSE", " LOOP", " READSEQ LST.DATA FROM Y.FILE.POINTER ELSE EOF = 1", " UNTIL EOF", " SEL.LIST.FT<-1> = Y.DATA", " REPEAT", " END"};
    public final String[] Readlist = {" SEL.CMD.QRY = 'SELECT ' : ", " CALL EB.READLIST(SEL.CMD.QRY,SEL.LIST,'',TOT.LIST,ERR.LIST)"};
    public final String[] Fread = {" CALL F.READ(FN,Y.ID,REC,F,E)"};
    public final String[] FWrite = {" CALL F.WRITE(FN,Y.ID,REC)", " CALL JOURNAL.UPDATE(Y.ID)"};
    public final String[] WriteFile = {" FILE.NAME = '.txt'", " FILE.PATH = 'YOUR.FOLDER'", " OPEN Y.FILE.PATH TO FIN.IN.PNTR ELSE", " GEN.ERR = 1", "ABORT 201, Y.FILE.PATH", "END", "", "WRITE Y.MSG.DATA ON FIN.IN.PNTR,Y.FILE.NAME ON ERROR", " WRITE.FAIL = 1", " END"};
    public final String[] Locate = {"LOCATE Y.VAR IN MY.DATA SETTING Y.POS THEN", "  Y.MID.RATE = MY.DATA<Y.POS>", " END"};
    public final String[] GetLocalRef = {"CALL GET.LOC.REF(\"TABLE.NAME\",\"FIELD.NAME\",Y.POS)", "Y.VAR  = R.CUS<PREFIX.LOCAL.REF><1,Y.POS>"};
    public final String[] FindStr = {"FINDSTR \"MER\" IN VAR.DATA SETTING Ap, Vp THEN", " Y.TEMP2 =  \" Field \":Ap:\", value \":Vp", "CRT   Y.TEMP2", " END ELSE", " Y.TEMP2 = \" not found\"", " END"};
    public final String[] CallCDD = {"RETDAYS = 'C'", "CALL CDD(\"\",'START.DATE','END.DATES',RETDAYS)"};
    public final String[] SubString = {"FIELD(YOUR.STRING,\"SEPERATE CHAR\",VALUE POSITION)"};
    public final String[] Trim = {"TRIM (YOUR VARIABLE,\"REMOVING CHAR\",\"A\")"};
    public final String[] CallCDT = {"  CALL CDT('REGION',Y.DATE,'+/- DAYS')"};
    public final String[] Convert = {"CONVERT '*' TO FM IN RECORD.VARIABLE", "CONVERT FM TO '*' IN RECORD.VARIABLE"};
    public final String[] Change = {"CHANGE(VARIABLE,\" OLD.VALUE\",\"NEW.VALUE\")"};
}
