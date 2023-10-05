/PROG  SAMPLE_PRODUCTION
/ATTR
OWNER		= SHIFT;
COMMENT		= "";
PROG_SIZE	= 8225;
CREATE		= DATE 23-06-05  TIME 03:03:40;
MODIFIED	= DATE 23-06-05  TIME 03:03:40;
FILE_NAME	= _FAKE_SP;
VERSION		= 0;
LINE_COUNT	= 182;
MEMORY_SIZE	= 8581;
PROTECT		= READ_WRITE;
STORAGE		= SHADOW;
TCD:  STACK_SIZE	= 0,
      TASK_PRIORITY	= 50,
      TIME_SLICE	= 0,
      BUSY_LAMP_OFF	= 0,
      ABORT_REQUEST	= 0,
      PAUSE_REQUEST	= 0;
DEFAULT_GROUP	= 1,*,*,*,*;
CONTROL_CODE	= 00000000 00000000;
/APPL

AUTO_SINGULARITY_HEADER;
  ENABLE_SINGULARITY_AVOIDANCE   : TRUE;
/MN
   1:  !SAMPLE PRODUCTION PROGRAMS ;
   2:  !INCLUDES ALL IO HANDLING ;
   4:   ;
   5:  !INITIALIZE VARIABLES ;
   6:  CALL INITDATA    ;
   7:   ;
   8:  !START FROM OR MOVE TO SAFE POS ;
   9:  CALL MOVE_SAFE(6) ;
  10:   ;
  13:  UFRAME_NUM=2 ;
  14:  UTOOL_NUM=1 ;
  15:   ;
  16:  !SET PLUME TABLE DEFAULT VALUE ;
  17:  CALL GUN_ROTATE(1) ;
  18:  GO[3:Plume Table Select]=1 ;
  19:   ;
  20:J P[1] 10% FINE ACC50    ;
  21:  WAIT   1.00(sec) ;
  22:   ;
  23:  CALL GUN_ON    ;
  24:  CALL FLOW_CHECK(6) ;
  25:   ;
  26:L P[2] 350mm/sec CNT100    ;
  27:L P[3] 350mm/sec CNT100    ;
  28:L P[4] 350mm/sec CNT100    ;
  29:L P[5] 350mm/sec CNT100    ;
  30:L P[6] 350mm/sec CNT100    ;
  31:L P[7] 350mm/sec CNT100    ;
  32:L P[8] 350mm/sec CNT100    ;
  33:L P[9] 350mm/sec CNT100    ;
  34:L P[10] 350mm/sec CNT100    ;
  35:  CALL GUN_OFF    ;
  36:   ;
  37:  !ERROR CHECK WITH HIGH SAFE POS ;
  38:  CALL ERROR_CHECK(6) ;
  39:   ;
  40:L P[11] 350mm/sec CNT100    ;
  41:   ;
  42:  CALL GUN_ON    ;
  43:   ;
  44:L P[12] 350mm/sec CNT100    ;
  45:L P[13] 350mm/sec CNT100    ;
  46:L P[14] 350mm/sec CNT100    ;
  47:L P[15] 350mm/sec CNT100    ;
  48:L P[16] 350mm/sec CNT100    ;
  49:L P[17] 350mm/sec CNT100    ;
  50:L P[18] 350mm/sec CNT100    ;
  51:L P[19] 350mm/sec CNT100    ;
  52:L P[20] 350mm/sec CNT100    ;
  53:  CALL GUN_OFF    ;
  54:   ;
  55:  !ERROR CHECK WITH HIGH SAFE POS ;
  56:  CALL ERROR_CHECK(6) ;
  57:   ;
  58:L P[21] 350mm/sec CNT100    ;
  59:   ;
  60:  CALL GUN_ON    ;
  61:   ;
  62:L P[22] 350mm/sec CNT100    ;
  63:L P[23] 350mm/sec CNT100    ;
  64:L P[24] 350mm/sec CNT100    ;
  65:L P[25] 350mm/sec CNT100    ;
  66:L P[26] 350mm/sec CNT100    ;
  67:L P[27] 350mm/sec CNT100    ;
  68:L P[28] 350mm/sec CNT100    ;
  69:L P[29] 350mm/sec CNT100    ;
  70:L P[30] 350mm/sec CNT100    ;
  71:  CALL GUN_OFF    ;
  72:   ;
  73:  !ERROR CHECK WITH HIGH SAFE POS ;
  74:  CALL ERROR_CHECK(6) ;
  75:   ;
  76:L P[31] 350mm/sec CNT100    ;
  77:   ;
  78:  CALL GUN_ON    ;
  79:   ;
  80:L P[32] 350mm/sec CNT100    ;
  81:L P[33] 350mm/sec CNT100    ;
  82:L P[34] 350mm/sec CNT100    ;
  83:L P[35] 350mm/sec CNT100    ;
  84:L P[36] 350mm/sec CNT100    ;
  85:L P[37] 350mm/sec CNT100    ;
  86:L P[38] 350mm/sec CNT100    ;
  87:L P[39] 350mm/sec CNT100    ;
  88:L P[40] 350mm/sec CNT100    ;
  89:  CALL GUN_OFF    ;
  90:   ;
  91:  !ERROR CHECK WITH HIGH SAFE POS ;
  92:  CALL ERROR_CHECK(6) ;
  93:   ;
  94:L P[41] 350mm/sec CNT100    ;
  95:   ;
  96:  CALL GUN_ON    ;
  97:   ;
  98:L P[42] 350mm/sec CNT100    ;
  99:L P[43] 350mm/sec CNT100    ;
 100:L P[44] 350mm/sec CNT100    ;
 101:L P[45] 350mm/sec CNT100    ;
 102:L P[46] 350mm/sec CNT100    ;
 103:L P[47] 350mm/sec CNT100    ;
 104:L P[48] 350mm/sec CNT100    ;
 105:L P[49] 350mm/sec CNT100    ;
 106:L P[50] 350mm/sec CNT100    ;
 107:  CALL GUN_OFF    ;
 108:   ;
 109:  !ERROR CHECK WITH HIGH SAFE POS ;
 110:  CALL ERROR_CHECK(6) ;
 111:   ;
 112:L P[51] 350mm/sec CNT100    ;
 113:   ;
 114:  CALL GUN_ON    ;
 115:   ;
 116:L P[52] 350mm/sec CNT100    ;
 117:L P[53] 350mm/sec CNT100    ;
 118:L P[54] 350mm/sec CNT100    ;
 119:L P[55] 350mm/sec CNT100    ;
 120:L P[56] 350mm/sec CNT100    ;
 121:L P[57] 350mm/sec CNT100    ;
 122:L P[58] 350mm/sec CNT100    ;
 123:L P[59] 350mm/sec CNT100    ;
 124:L P[60] 350mm/sec CNT100    ;
 125:  CALL GUN_OFF    ;
 126:   ;
 127:  !ERROR CHECK WITH HIGH SAFE POS ;
 128:  CALL ERROR_CHECK(6) ;
 129:   ;
 130:L P[61] 350mm/sec CNT100    ;
 131:   ;
 132:  CALL GUN_ON    ;
 133:   ;
 134:L P[62] 350mm/sec CNT100    ;
 135:L P[63] 350mm/sec CNT100    ;
 136:L P[64] 350mm/sec CNT100    ;
 137:L P[65] 350mm/sec CNT100    ;
 138:L P[66] 350mm/sec CNT100    ;
 139:L P[67] 350mm/sec CNT100    ;
 140:L P[68] 350mm/sec CNT100    ;
 141:L P[69] 350mm/sec CNT100    ;
 142:L P[70] 350mm/sec CNT100    ;
 143:  CALL GUN_OFF    ;
 144:   ;
 145:  !ERROR CHECK WITH HIGH SAFE POS ;
 146:  CALL ERROR_CHECK(6) ;
 147:   ;
 148:L P[71] 350mm/sec CNT100    ;
 149:   ;
 150:  CALL GUN_ON    ;
 151:   ;
 152:L P[72] 350mm/sec CNT100    ;
 153:L P[73] 350mm/sec CNT100    ;
 154:L P[74] 350mm/sec CNT100    ;
 155:L P[75] 350mm/sec CNT100    ;
 156:L P[76] 350mm/sec CNT100    ;
 157:L P[77] 350mm/sec CNT100    ;
 158:L P[78] 350mm/sec CNT100    ;
 159:L P[79] 350mm/sec CNT100    ;
 160:L P[80] 350mm/sec CNT100    ;
 161:  CALL GUN_OFF    ;
 162:   ;
 163:  !ERROR CHECK WITH HIGH SAFE POS ;
 164:  CALL ERROR_CHECK(6) ;
 165:   ;
 166:L P[81] 350mm/sec CNT100    ;
 167:   ;
 168:  CALL GUN_ON    ;
 169:   ;
 170:L P[82] 350mm/sec CNT100    ;
 171:L P[83] 350mm/sec CNT100    ;
 172:L P[84] 350mm/sec CNT100    ;
 173:L P[85] 350mm/sec CNT100    ;
 174:L P[86] 350mm/sec CNT100    ;
 175:L P[87] 350mm/sec CNT100    ;
 176:L P[88] 350mm/sec CNT100    ;
 177:L P[89] 350mm/sec CNT100    ;
 178:L P[90] 350mm/sec FINE    ;
 179:  CALL GUN_OFF    ;
 180:  WAIT   1.00(sec) ;
 181:   ;
 182:J PR[6:SAFE HIGH] 15% FINE ACC50    ;
/POS
P[1]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1945.268  mm,	Y =    15.956  mm,	Z =  -441.749  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=   700.000  mm
};
P[2]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1776.927  mm,	Y =    14.665  mm,	Z =  -303.971  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=   750.000  mm
};
P[3]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1675.410  mm,	Y =    13.867  mm,	Z =  -218.557  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=   800.000  mm
};
P[4]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1508.616  mm,	Y =    12.522  mm,	Z =  -134.901  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   850.000  mm
};
P[5]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1273.512  mm,	Y =    10.591  mm,	Z =   -62.766  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=   900.000  mm
};
P[6]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   968.983  mm,	Y =     8.055  mm,	Z =   -17.641  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .482 deg,
	E1=   950.000  mm
};
P[7]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   582.497  mm,	Y =     4.801  mm,	Z =    -4.343  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=  1000.000  mm
};
P[8]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   313.649  mm,	Y =     2.531  mm,	Z =    -5.783  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=  1050.000  mm
};
P[9]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    24.874  mm,	Y =      .092  mm,	Z =    -6.905  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=  1100.000  mm
};
P[10]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -125.121  mm,	Y =    -1.181  mm,	Z =    -6.790  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=  1150.000  mm
};
P[11]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -126.852  mm,	Y =   202.812  mm,	Z =    -6.943  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=  1150.000  mm
};
P[12]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    23.143  mm,	Y =   204.085  mm,	Z =    -7.059  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=  1100.000  mm
};
P[13]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   311.918  mm,	Y =   206.523  mm,	Z =    -5.937  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=  1050.000  mm
};
P[14]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   580.766  mm,	Y =   208.793  mm,	Z =    -4.496  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=  1000.000  mm
};
P[15]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   967.252  mm,	Y =   212.047  mm,	Z =   -17.795  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .482 deg,
	E1=   950.000  mm
};
P[16]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1271.781  mm,	Y =   214.584  mm,	Z =   -62.920  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=   900.000  mm
};
P[17]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1506.882  mm,	Y =   216.515  mm,	Z =  -135.054  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   850.000  mm
};
P[18]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1673.674  mm,	Y =   217.859  mm,	Z =  -218.710  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=   800.000  mm
};
P[19]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1775.205  mm,	Y =   218.658  mm,	Z =  -304.127  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=   750.000  mm
};
P[20]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1943.546  mm,	Y =   219.948  mm,	Z =  -441.905  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=   700.000  mm
};
P[21]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1941.823  mm,	Y =   423.941  mm,	Z =  -442.060  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=   700.000  mm
};
P[22]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1773.482  mm,	Y =   422.650  mm,	Z =  -304.282  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=   650.000  mm
};
P[23]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1671.939  mm,	Y =   421.852  mm,	Z =  -218.863  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=   600.000  mm
};
P[24]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1505.149  mm,	Y =   420.507  mm,	Z =  -135.208  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   550.000  mm
};
P[25]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1270.050  mm,	Y =   418.577  mm,	Z =   -63.074  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=   500.000  mm
};
P[26]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   965.520  mm,	Y =   416.040  mm,	Z =   -17.948  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .482 deg,
	E1=   450.000  mm
};
P[27]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   579.034  mm,	Y =   412.786  mm,	Z =    -4.650  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=   400.000  mm
};
P[28]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   310.186  mm,	Y =   410.516  mm,	Z =    -6.091  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=   350.000  mm
};
P[29]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    21.411  mm,	Y =   408.077  mm,	Z =    -7.213  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=   300.000  mm
};
P[30]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -128.583  mm,	Y =   406.805  mm,	Z =    -7.097  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=   250.000  mm
};
P[31]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -130.314  mm,	Y =   610.797  mm,	Z =    -7.251  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=   250.000  mm
};
P[32]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    19.680  mm,	Y =   612.070  mm,	Z =    -7.367  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=   200.000  mm
};
P[33]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   308.455  mm,	Y =   614.509  mm,	Z =    -6.245  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=   150.000  mm
};
P[34]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   577.303  mm,	Y =   616.779  mm,	Z =    -4.804  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .486 deg,
	E1=   100.000  mm
};
P[35]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   963.789  mm,	Y =   620.032  mm,	Z =   -18.102  mm,
	W =   179.957 deg,	P =    10.000 deg,	R =      .482 deg,
	E1=    50.000  mm
};
P[36]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1268.319  mm,	Y =   622.569  mm,	Z =   -63.228  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=     0.000  mm
};
P[37]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1503.415  mm,	Y =   624.500  mm,	Z =  -135.361  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   -50.000  mm
};
P[38]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1670.203  mm,	Y =   625.844  mm,	Z =  -219.016  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=  -100.000  mm
};
P[39]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1771.760  mm,	Y =   626.643  mm,	Z =  -304.438  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=  -150.000  mm
};
P[40]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1940.101  mm,	Y =   627.934  mm,	Z =  -442.216  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=  -200.000  mm
};
P[41]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1938.378  mm,	Y =   831.927  mm,	Z =  -442.372  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=  -200.000  mm
};
P[42]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1770.038  mm,	Y =   830.636  mm,	Z =  -304.594  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=  -150.000  mm
};
P[43]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1668.468  mm,	Y =   829.837  mm,	Z =  -219.169  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=  -100.000  mm
};
P[44]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1501.682  mm,	Y =   828.492  mm,	Z =  -135.514  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   -50.000  mm
};
P[45]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1266.588  mm,	Y =   826.562  mm,	Z =   -63.382  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=     0.000  mm
};
P[46]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   962.058  mm,	Y =   824.025  mm,	Z =   -18.256  mm,
	W =   179.957 deg,	P =     5.343 deg,	R =      .482 deg,
	E1=    50.000  mm
};
P[47]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   575.572  mm,	Y =   820.771  mm,	Z =    -4.958  mm,
	W =   179.957 deg,	P =     -.077 deg,	R =      .486 deg,
	E1=   100.000  mm
};
P[48]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   306.724  mm,	Y =   818.501  mm,	Z =    -6.399  mm,
	W =   179.957 deg,	P =     -.564 deg,	R =      .486 deg,
	E1=   150.000  mm
};
P[49]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    17.949  mm,	Y =   816.063  mm,	Z =    -7.521  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   200.000  mm
};
P[50]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -132.046  mm,	Y =   814.790  mm,	Z =    -7.405  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   250.000  mm
};
P[51]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -133.777  mm,	Y =  1018.782  mm,	Z =    -7.558  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   250.000  mm
};
P[52]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    16.218  mm,	Y =  1020.055  mm,	Z =    -7.674  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   200.000  mm
};
P[53]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   304.993  mm,	Y =  1022.494  mm,	Z =    -6.552  mm,
	W =   179.957 deg,	P =     -.564 deg,	R =      .486 deg,
	E1=   150.000  mm
};
P[54]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   573.841  mm,	Y =  1024.764  mm,	Z =    -5.111  mm,
	W =   179.957 deg,	P =     -.077 deg,	R =      .486 deg,
	E1=   100.000  mm
};
P[55]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   960.328  mm,	Y =  1028.018  mm,	Z =   -18.410  mm,
	W =   179.957 deg,	P =     5.343 deg,	R =      .482 deg,
	E1=    50.000  mm
};
P[56]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1264.857  mm,	Y =  1030.554  mm,	Z =   -63.535  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=     0.000  mm
};
P[57]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1499.949  mm,	Y =  1032.485  mm,	Z =  -135.667  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   -50.000  mm
};
P[58]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1666.733  mm,	Y =  1033.829  mm,	Z =  -219.322  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=  -100.000  mm
};
P[59]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1768.315  mm,	Y =  1034.628  mm,	Z =  -304.750  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=  -150.000  mm
};
P[60]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1936.656  mm,	Y =  1035.919  mm,	Z =  -442.527  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=  -200.000  mm
};
P[61]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1934.934  mm,	Y =  1239.912  mm,	Z =  -442.683  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=  -200.000  mm
};
P[62]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1766.593  mm,	Y =  1238.621  mm,	Z =  -304.906  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=  -150.000  mm
};
P[63]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1664.998  mm,	Y =  1237.822  mm,	Z =  -219.475  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=  -100.000  mm
};
P[64]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1498.215  mm,	Y =  1236.478  mm,	Z =  -135.821  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   -50.000  mm
};
P[65]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1263.126  mm,	Y =  1234.547  mm,	Z =   -63.689  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=     0.000  mm
};
P[66]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   958.596  mm,	Y =  1232.010  mm,	Z =   -18.564  mm,
	W =   179.957 deg,	P =     5.343 deg,	R =      .482 deg,
	E1=    50.000  mm
};
P[67]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   572.110  mm,	Y =  1228.756  mm,	Z =    -5.265  mm,
	W =   179.957 deg,	P =     -.077 deg,	R =      .486 deg,
	E1=   100.000  mm
};
P[68]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   303.262  mm,	Y =  1226.486  mm,	Z =    -6.706  mm,
	W =   179.957 deg,	P =     -.564 deg,	R =      .486 deg,
	E1=   150.000  mm
};
P[69]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    14.487  mm,	Y =  1224.048  mm,	Z =    -7.828  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   200.000  mm
};
P[70]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -135.508  mm,	Y =  1222.775  mm,	Z =    -7.712  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   250.000  mm
};
P[71]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -137.239  mm,	Y =  1426.767  mm,	Z =    -7.866  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   250.000  mm
};
P[72]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    12.755  mm,	Y =  1428.041  mm,	Z =    -7.982  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   200.000  mm
};
P[73]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   301.530  mm,	Y =  1430.479  mm,	Z =    -6.860  mm,
	W =   179.957 deg,	P =     -.564 deg,	R =      .486 deg,
	E1=   150.000  mm
};
P[74]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   570.379  mm,	Y =  1432.749  mm,	Z =    -5.419  mm,
	W =   179.957 deg,	P =     -.077 deg,	R =      .486 deg,
	E1=   100.000  mm
};
P[75]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   956.865  mm,	Y =  1436.003  mm,	Z =   -18.718  mm,
	W =   179.957 deg,	P =     5.343 deg,	R =      .482 deg,
	E1=    50.000  mm
};
P[76]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1261.395  mm,	Y =  1438.540  mm,	Z =   -63.843  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=     0.000  mm
};
P[77]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1496.481  mm,	Y =  1440.470  mm,	Z =  -135.974  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   -50.000  mm
};
P[78]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1663.262  mm,	Y =  1441.815  mm,	Z =  -219.628  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=  -100.000  mm
};
P[79]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1764.870  mm,	Y =  1442.614  mm,	Z =  -305.062  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=  -150.000  mm
};
P[80]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1933.211  mm,	Y =  1443.905  mm,	Z =  -442.839  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=  -200.000  mm
};
P[81]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1931.489  mm,	Y =  1647.897  mm,	Z =  -442.994  mm,
	W =   179.952 deg,	P =    25.000 deg,	R =      .463 deg,
	E1=  -200.000  mm
};
P[82]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1763.148  mm,	Y =  1646.606  mm,	Z =  -305.218  mm,
	W =   179.951 deg,	P =    27.179 deg,	R =      .461 deg,
	E1=  -150.000  mm
};
P[83]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1661.527  mm,	Y =  1645.807  mm,	Z =  -219.781  mm,
	W =   179.951 deg,	P =    28.020 deg,	R =      .464 deg,
	E1=  -100.000  mm
};
P[84]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1494.748  mm,	Y =  1644.463  mm,	Z =  -136.127  mm,
	W =   179.954 deg,	P =    21.999 deg,	R =      .469 deg,
	E1=   -50.000  mm
};
P[85]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  1259.664  mm,	Y =  1642.532  mm,	Z =   -63.997  mm,
	W =   179.956 deg,	P =    12.182 deg,	R =      .476 deg,
	E1=     0.000  mm
};
P[86]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   955.134  mm,	Y =  1639.995  mm,	Z =   -18.871  mm,
	W =   179.957 deg,	P =     5.343 deg,	R =      .482 deg,
	E1=    50.000  mm
};
P[87]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   568.648  mm,	Y =  1636.741  mm,	Z =    -5.573  mm,
	W =   179.957 deg,	P =     -.077 deg,	R =      .486 deg,
	E1=   100.000  mm
};
P[88]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =   299.799  mm,	Y =  1634.472  mm,	Z =    -7.014  mm,
	W =   179.957 deg,	P =     -.564 deg,	R =      .486 deg,
	E1=   150.000  mm
};
P[89]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =    11.024  mm,	Y =  1632.033  mm,	Z =    -8.136  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   200.000  mm
};
P[90]{
   GP1:
	UF : 2, UT : 1,		CONFIG : 'F U T, 0, 0, 0',
	X =  -138.970  mm,	Y =  1630.760  mm,	Z =    -8.020  mm,
	W =   179.957 deg,	P =      .044 deg,	R =      .486 deg,
	E1=   250.000  mm
};
/END
