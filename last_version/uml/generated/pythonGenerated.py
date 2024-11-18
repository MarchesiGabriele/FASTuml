from enum import Enum

class ClasseB(ClasseA):
    def __init__(self, a:int):
        pass
    a: int = None
    __ma: int = None
    __name: str = None
    _numbers: int = None
    def methodA(self):
        pass
    def _methodB(self, x:int, y:str) -> int:
        pass


class ClasseA:
    def __init__(self, a:int):
        pass
    a: int = None
    __name: str = None
    _numbers: int = None
    def methodA(self):
        pass
    def _methodB(self, x:int, y:str) -> int:
        pass


class Pippo(Enum):
    MARIO = 'mario'
    LUIGI = 'luigi'
    YOSHI = 'yoshi'


