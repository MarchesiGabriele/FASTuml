from enum import Enum

class ClasseB(ClasseA):
    a: int = None
    __ma: int = None
    __name: str = None
    _numbers: int = None
    def methodA(self):
        pass
    def _methodB(self, x:int, y:String) -> int:
        pass


class ClasseA:
    a: int = None
    __name: str = None
    _numbers: int = None
    def methodA(self):
        pass
    def _methodB(self, x:int, y:String) -> int:
        pass


class Pippo(Enum):
    MARIO = 'mario'
    LUIGI = 'luigi'
    YOSHI = 'yoshi'


