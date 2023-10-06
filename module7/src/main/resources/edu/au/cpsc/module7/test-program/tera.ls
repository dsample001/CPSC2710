/PROG  TERA
/ATTR
OWNER		= SHIFT;
COMMENT		= "";
PROG_SIZE	= 3965;
CREATE		= DATE 23-09-30  TIME 08:41:54;
MODIFIED	= DATE 23-09-30  TIME 09:29:08;
FILE_NAME	= TERA;
VERSION		= 0;
LINE_COUNT	= 109;
MEMORY_SIZE	= 4309;
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
/MN
   1:  !Check for valid cart #. ;
   2:  IF GI[3:Location 1 Cart ID]=0 OR GI[3:Location 1 Cart ID]>6,CALL UALARM ;
   3:   ;
   4:  !Load UserFrame into UF1. ;
   5:  CALL LOAD_USER_FRAME(1) ;
   6:   ;
   7:  CALL MOVE_CART1PART1    ;
   8:   ;
   9:  UFRAME_NUM=1 ;
  10:  UTOOL_NUM=3 ;
  11:  CALL FLOW_CHECK(13) ;
  12:  CALL ERROR_CHECK(13) ;
  13:J P[1:Safe pos] 10% FINE    ;
  14:   ;
  15:  !X 1350 ;
  16:L P[2] 100mm/sec FINE    ;
  17:L P[3] 100mm/sec FINE    ;
  18:L P[4] 100mm/sec FINE    ;
  19:   ;
  20:  !X 900 ;
  21:L P[5] 100mm/sec FINE    ;
  22:L P[6] 100mm/sec FINE    ;
  23:L P[7] 100mm/sec FINE    ;
  24:   ;
  25:  !X Flat ;
  26:L P[8] 100mm/sec FINE    ;
  27:L P[9] 100mm/sec FINE    ;
  28:L P[10] 100mm/sec FINE    ;
  29:   ;
  30:  !Retract ;
  31:L P[11] 250mm/sec FINE    ;
  32:L P[12] 250mm/sec FINE    ;
  33:L P[13:Safe pos] 250mm/sec FINE    ;
  34:   ;
  35:  !Clock ;
  36:J P[14:Right start] 10% FINE    ;
  37:   ;
  38:  !X 1350 ;
  39:L P[15] 100mm/sec FINE    ;
  40:L P[16] 100mm/sec FINE    ;
  41:L P[15] 100mm/sec FINE    ;
  42:   ;
  43:  !X 900 ;
  44:L P[17] 100mm/sec FINE    ;
  45:L P[18] 100mm/sec FINE    ;
  46:L P[17] 100mm/sec FINE    ;
  47:   ;
  48:   ;
  49:  !X 500 ;
  50:L P[19] 100mm/sec FINE    ;
  51:L P[20] 100mm/sec FINE    ;
  52:L P[19] 100mm/sec FINE    ;
  53:   ;
  54:  !Retract ;
  55:L P[17] 250mm/sec FINE    ;
  56:L P[15] 250mm/sec FINE    ;
  57:L P[21:Right start] 250mm/sec FINE    ;
  58:   ;
  59:   ;
  60:  !Clock Bottom ;
  61:J P[22:Bottom start] 10% FINE    ;
  62:   ;
  63:  !X 1350 ;
  64:L P[23] 100mm/sec FINE    ;
  65:L P[24] 100mm/sec FINE    ;
  66:L P[23] 100mm/sec FINE    ;
  67:   ;
  68:  !X 900 ;
  69:L P[25] 100mm/sec FINE    ;
  70:L P[26] 100mm/sec FINE    ;
  71:L P[25] 100mm/sec FINE    ;
  72:   ;
  73:   ;
  74:  !X 500 ;
  75:L P[27] 100mm/sec FINE    ;
  76:L P[28] 100mm/sec FINE    ;
  77:L P[27] 100mm/sec FINE    ;
  78:   ;
  79:  !Retract ;
  80:L P[25] 250mm/sec FINE    ;
  81:L P[23] 250mm/sec FINE    ;
  82:L P[22:Bottom start] 100mm/sec FINE    ;
  83:   ;
  84:   ;
  85:  !Clock Left ;
  86:J P[29:Left start] 10% FINE    ;
  87:   ;
  88:  !X 1350 ;
  89:L P[30] 100mm/sec FINE    ;
  90:L P[31] 100mm/sec FINE    ;
  91:L P[30] 100mm/sec FINE    ;
  92:   ;
  93:  !X 900 ;
  94:L P[32] 100mm/sec FINE    ;
  95:L P[33] 100mm/sec FINE    ;
  96:L P[32] 100mm/sec FINE    ;
  97:   ;
  98:   ;
  99:  !X 500 ;
 100:L P[34] 100mm/sec FINE    ;
 101:L P[35] 100mm/sec FINE    ;
 102:L P[34] 100mm/sec FINE    ;
 103:   ;
 104:  !Retract ;
 105:L P[32] 250mm/sec FINE    ;
 106:L P[30] 250mm/sec FINE    ;
 107:L P[29:Left start] 250mm/sec FINE    ;
 108:   ;
 109:J PR[93:Cart 1 Part 1] 10% FINE    ;
/POS
P[1:"Safe pos"]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  2072.661  mm,	Y =     -.039  mm,	Z =   -55.378  mm,
	W =   179.998 deg,	P =      .003 deg,	R =  -179.975 deg,
	E1=      .000  mm
};
P[2]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1503.336  mm,	Y =     8.317  mm,	Z =   -54.471  mm,
	W =   179.998 deg,	P =      .003 deg,	R =  -179.975 deg,
	E1=      .000  mm
};
P[3]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1503.301  mm,	Y =     8.492  mm,	Z =   -80.424  mm,
	W =   179.998 deg,	P =      .003 deg,	R =  -179.975 deg,
	E1=      .000  mm
};
P[4]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1503.336  mm,	Y =     8.317  mm,	Z =   -54.471  mm,
	W =   179.998 deg,	P =      .003 deg,	R =  -179.975 deg,
	E1=      .000  mm
};
P[5]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1052.134  mm,	Y =    12.500  mm,	Z =   -53.767  mm,
	W =   179.999 deg,	P =     -.002 deg,	R =   179.112 deg,
	E1=      .000  mm
};
P[6]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1052.108  mm,	Y =    12.616  mm,	Z =   -71.046  mm,
	W =   179.999 deg,	P =     -.002 deg,	R =   179.112 deg,
	E1=      .000  mm
};
P[7]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1052.134  mm,	Y =    12.500  mm,	Z =   -53.767  mm,
	W =   179.999 deg,	P =     -.002 deg,	R =   179.112 deg,
	E1=      .000  mm
};
P[8]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   257.291  mm,	Y =    20.571  mm,	Z =   -47.326  mm,
	W =  -179.997 deg,	P =      .217 deg,	R =   178.970 deg,
	E1=      .001  mm
};
P[9]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   257.284  mm,	Y =    20.606  mm,	Z =   -52.606  mm,
	W =  -179.997 deg,	P =      .217 deg,	R =   178.970 deg,
	E1=      .001  mm
};
P[10]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   257.291  mm,	Y =    20.571  mm,	Z =   -47.326  mm,
	W =  -179.997 deg,	P =      .217 deg,	R =   178.970 deg,
	E1=      .001  mm
};
P[11]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1052.134  mm,	Y =    12.500  mm,	Z =   -53.767  mm,
	W =   179.999 deg,	P =     -.002 deg,	R =   179.112 deg,
	E1=      .000  mm
};
P[12]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1503.336  mm,	Y =     8.317  mm,	Z =   -54.471  mm,
	W =   179.998 deg,	P =      .003 deg,	R =  -179.975 deg,
	E1=      .000  mm
};
P[13:"Safe pos"]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  2072.661  mm,	Y =     -.039  mm,	Z =   -55.378  mm,
	W =   179.998 deg,	P =      .003 deg,	R =  -179.975 deg,
	E1=      .000  mm
};
P[14:"Right start"]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  2075.240  mm,	Y =   -47.706  mm,	Z =    -5.674  mm,
	W =   -89.993 deg,	P =      .019 deg,	R =   179.999 deg,
	E1=      .000  mm
};
P[15]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1350.000  mm,	Y =   -47.706  mm,	Z =    -5.674  mm,
	W =   -89.993 deg,	P =      .019 deg,	R =   179.999 deg,
	E1=      .000  mm
};
P[16]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1349.653  mm,	Y =   -71.343  mm,	Z =    -5.832  mm,
	W =   -89.993 deg,	P =      .019 deg,	R =   179.999 deg,
	E1=      .000  mm
};
P[17]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   900.000  mm,	Y =   -47.706  mm,	Z =    -5.674  mm,
	W =   -89.993 deg,	P =      .019 deg,	R =   179.999 deg,
	E1=      .000  mm
};
P[18]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   900.000  mm,	Y =   -71.343  mm,	Z =    -5.832  mm,
	W =   -89.993 deg,	P =      .019 deg,	R =   179.999 deg,
	E1=      .000  mm
};
P[19]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   500.002  mm,	Y =   -47.706  mm,	Z =    -5.674  mm,
	W =   -89.988 deg,	P =      .431 deg,	R =   179.659 deg,
	E1=      .000  mm
};
P[20]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   499.826  mm,	Y =   -59.706  mm,	Z =    -5.754  mm,
	W =   -89.988 deg,	P =      .431 deg,	R =   179.659 deg,
	E1=      .000  mm
};
P[21:"Right start"]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  2075.240  mm,	Y =   -47.706  mm,	Z =    -5.674  mm,
	W =   -89.993 deg,	P =      .019 deg,	R =   179.999 deg,
	E1=      .000  mm
};
P[22:"Bottom start"]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  2075.115  mm,	Y =     -.752  mm,	Z =    47.143  mm,
	W =      .024 deg,	P =      .016 deg,	R =  -180.000 deg,
	E1=      .000  mm
};
P[23]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1350.000  mm,	Y =     5.594  mm,	Z =    51.097  mm,
	W =      .024 deg,	P =      .016 deg,	R =  -180.000 deg,
	E1=      .000  mm
};
P[24]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =  1350.000  mm,	Y =     5.420  mm,	Z =    77.016  mm,
	W =      .024 deg,	P =      .016 deg,	R =  -180.000 deg,
	E1=      .000  mm
};
P[25]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   900.001  mm,	Y =     5.595  mm,	Z =    51.096  mm,
	W =      .024 deg,	P =      .015 deg,	R =   179.787 deg,
	E1=      .000  mm
};
P[26]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   900.002  mm,	Y =     5.420  mm,	Z =    77.016  mm,
	W =      .024 deg,	P =      .013 deg,	R =   179.592 deg,
	E1=      .000  mm
};
P[27]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   500.002  mm,	Y =     5.594  mm,	Z =    51.096  mm,
	W =      .026 deg,	P =      .304 deg,	R =   179.396 deg,
	E1=      .000  mm
};
P[28]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, 0',
	X =   500.042  mm,	Y =     5.419  mm,	Z =    77.017  mm,
	W =      .026 deg,	P =      .304 deg,	R =   179.396 deg,
	E1=      .000  mm
};
P[29:"Left start"]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, -1',
	X =  2075.143  mm,	Y =    51.922  mm,	Z =      .279  mm,
	W =    89.988 deg,	P =      .016 deg,	R =  -179.999 deg,
	E1=      .000  mm
};
P[30]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, -1',
	X =  1350.107  mm,	Y =    59.121  mm,	Z =      .327  mm,
	W =    89.989 deg,	P =      .013 deg,	R =   179.592 deg,
	E1=      .000  mm
};
P[31]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, -1',
	X =  1350.510  mm,	Y =    86.477  mm,	Z =      .511  mm,
	W =    89.990 deg,	P =      .012 deg,	R =   179.417 deg,
	E1=      .000  mm
};
P[32]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, -1',
	X =   900.000  mm,	Y =    59.121  mm,	Z =      .327  mm,
	W =    89.989 deg,	P =      .013 deg,	R =   179.592 deg,
	E1=      .000  mm
};
P[33]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, -1',
	X =   900.000  mm,	Y =    86.477  mm,	Z =      .511  mm,
	W =    89.990 deg,	P =      .012 deg,	R =   179.417 deg,
	E1=      .000  mm
};
P[34]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, -1',
	X =   500.001  mm,	Y =    59.119  mm,	Z =      .328  mm,
	W =    89.993 deg,	P =      .324 deg,	R =   179.618 deg,
	E1=      .000  mm
};
P[35]{
   GP1:
	UF : 1, UT : 3,		CONFIG : 'F U T, 0, 0, -1',
	X =   500.000  mm,	Y =    86.477  mm,	Z =      .511  mm,
	W =    89.990 deg,	P =      .012 deg,	R =   179.417 deg,
	E1=      .000  mm
};
/END
